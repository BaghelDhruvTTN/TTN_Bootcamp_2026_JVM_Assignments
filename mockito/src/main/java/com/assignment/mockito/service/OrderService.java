
package com.assignment.mockito.service;

import com.assignment.mockito.domain.Order;

public class OrderService {

    private final EmailService emailService;

    public static OrderService getInstance() {
        return new OrderService();
    }

    public OrderService() {
        this.emailService = EmailService.getInstance();
    }

    void placeOrder(Order order) {
        double priceWithTax = order.getPrice() * 20 / 100;
        order.setPriceWithTax(priceWithTax);
        emailService.sendEmail(order);
        order.setCustomerNotified(true);
    }

    boolean placeOrder(Order order, String cc) {
        double priceWithTax = order.getPrice() * 20 / 100;
        order.setPriceWithTax(priceWithTax);
        boolean isNotified = emailService.sendEmail(order, cc);
        order.setCustomerNotified(isNotified);
        return isNotified;
    }
}
