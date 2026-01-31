package com.demo.service;

import com.demo.domain.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
class EmailServiceTest {

    private final EmailService emailService = new EmailService();

    @Test
    void sendEmail_withOrder_throwsRuntimeException() {
        Order order = new Order(2, "Widget", 10.0);

        RuntimeException thrown = assertThrows(RuntimeException.class,
                () -> emailService.sendEmail(order));

        assertTrue(thrown.getMessage().contains("An Exception Occurred"));
        assertFalse(order.isCustomerNotified());
    }

    @Test
    void sendEmail_withOrderAndCc_setsCustomerNotifiedAndReturnsTrue() {
        Order order = new Order(1, "Item", 25.0);

        boolean result = emailService.sendEmail(order, "cc@example.com");

        assertTrue(result);
        assertTrue(order.isCustomerNotified());
    }
}
