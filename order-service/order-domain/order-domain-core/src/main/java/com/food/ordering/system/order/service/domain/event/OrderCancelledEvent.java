package com.food.ordering.system.order.service.domain.event;

import com.event.publisher.DomainEventPublisher;
import com.food.ordering.system.order.service.domain.entity.Order;


import java.time.ZonedDateTime;


public class OrderCancelledEvent extends OrderEvent {

    private final DomainEventPublisher<OrderCancelledEvent> domainEventPublisher;

    public OrderCancelledEvent(Order order,
                               ZonedDateTime createdAt) {
        super(order, createdAt);
    }


    @Override
    public void fire() {
        domainEventPublisher.publish(this);
    }
}
