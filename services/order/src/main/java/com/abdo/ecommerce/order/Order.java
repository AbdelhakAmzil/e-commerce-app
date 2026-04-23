package com.abdo.ecommerce.order;

import static jakarta.persistence.EnumType.STRING;

import com.abdo.ecommerce.orderLine.OrderLine;
import jakarta.persistence.Enumerated;

import javax.print.DocFlavor;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Order {

    private Integer id;
    private String reference;
    private BigDecimal totalAmount;
    @Enumerated(STRING)
    private PayementMethod payementMethod;
    private String customerId;
    private List<OrderLine> orderLines;
    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedDate;
}
