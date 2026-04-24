package com.abdo.ecommerce.kafka;

import com.abdo.ecommerce.customer.CustomerResponse;
import com.abdo.ecommerce.order.PaymentMethod;
import com.abdo.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
