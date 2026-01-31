package com.demo.service;

import com.demo.domain.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OrderServiceTest {

    @Mock
    private EmailService emailService;

    @InjectMocks
    private OrderService orderService;

    @Test
    void placeOrder_withOrder_calculatesPriceWithTaxAndCallsSendEmail() {
        Order order = new Order(2, "Widget", 100.0);

        orderService.placeOrder(order);

        assertEquals(120.0, order.getPriceWithTax(), 0.001);
        assertTrue(order.isCustomerNotified());
        verify(emailService).sendEmail(order);
    }

    @Test
    void placeOrder_withOrder_throwsWhenEmailServiceThrows() {
        Order order = new Order(1, "Item", 50.0);
        doThrow(new RuntimeException("Email failed")).when(emailService).sendEmail(any(Order.class));

        assertThrows(RuntimeException.class, () -> orderService.placeOrder(order));

        assertEquals(60.0, order.getPriceWithTax(), 0.001);
        verify(emailService).sendEmail(order);
    }

    @Test
    void placeOrder_withOrderAndCc_calculatesTaxCallsSendEmailAndReturnsResult() {
        Order order = new Order(3, "Gadget", 200.0);
        when(emailService.sendEmail(any(Order.class), eq("bcc@example.com"))).thenReturn(true);

        boolean result = orderService.placeOrder(order, "bcc@example.com");

        assertTrue(result);
        assertEquals(240.0, order.getPriceWithTax(), 0.001);
        assertTrue(order.isCustomerNotified());
        verify(emailService).sendEmail(order, "bcc@example.com");
    }

    @Test
    void placeOrder_withOrderAndCc_propagatesReturnValueFromEmailService() {
        Order order = new Order(1, "Item", 10.0);
        when(emailService.sendEmail(any(Order.class), eq("cc"))).thenReturn(false);

        boolean result = orderService.placeOrder(order, "cc");

        assertFalse(result);
        assertFalse(order.isCustomerNotified());
    }
}
