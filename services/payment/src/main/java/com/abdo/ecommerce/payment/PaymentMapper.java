package com.abdo.ecommerce.payment;

import org.springframework.stereotype.Service;

@Service
public class PaymentMapper {
    public Payment toPayment(PaymentRequest request) {
        return Payment.builder()
                .id(request.id())
                .orderId(request.id())
                .paymentMethod(request.paymentMethod())
                .amount(request.amount())
                .build();
    }
}
