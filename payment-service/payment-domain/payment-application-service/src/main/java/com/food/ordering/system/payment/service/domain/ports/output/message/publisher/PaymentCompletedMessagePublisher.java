package com.food.ordering.system.payment.service.domain.ports.output.message.publisher;


import com.event.publisher.DomainEventPublisher;
import com.food.ordering.system.payment.service.domain.event.PaymentCompletedEvent;

public interface PaymentCompletedMessagePublisher extends DomainEventPublisher<PaymentCompletedEvent> {
}