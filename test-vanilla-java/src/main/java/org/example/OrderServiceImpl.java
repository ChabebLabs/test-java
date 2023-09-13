package org.example;

// OrderServiceImpl.java
public class OrderServiceImpl implements OrderService {
    private PaymentService paymentService;

    public OrderServiceImpl(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public boolean placeOrder(double orderAmount) {
        return paymentService.processPayment(orderAmount);
    }
}
