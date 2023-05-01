package com.food.ordering.system.order.service.domain.exception;

import com.exception.DomainException;

public class OrderDomainException extends DomainException {

    public OrderDomainException(String s) {
        super(message);
    }

    public OrderDomainException(String message, Throwable cause) {
        super(message, cause);
    }
}
