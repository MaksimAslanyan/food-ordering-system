package com.food.ordering.system.order.service.domain.entity;

import com.entity.AggregateRoot;
import com.valueobject.CustomerId;

public class Customer extends AggregateRoot<CustomerId> {

    public Customer() {
    }

    public Customer(CustomerId customerId) {
        super.setId(customerId);
    }
}
