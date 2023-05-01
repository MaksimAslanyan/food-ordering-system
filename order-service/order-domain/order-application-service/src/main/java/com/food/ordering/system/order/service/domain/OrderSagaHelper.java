package com.food.ordering.system.order.service.domain;

import com.food.ordering.system.order.service.domain.entity.Order;
import com.food.ordering.system.order.service.domain.exception.OrderNotFoundException;
import com.food.ordering.system.order.service.domain.ports.output.repository.OrderRepository;
import com.food.ordering.system.saga.SagaStatus;
import com.valueobject.OrderId;
import com.valueobject.OrderStatus;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Optional;

import static com.food.ordering.system.saga.SagaStatus.*;
import static java.lang.String.format;
import static java.util.UUID.fromString;

@Slf4j
@Component
@RequiredArgsConstructor
public class OrderSagaHelper {

    private final OrderRepository orderRepository;

    Order findOrder(String orderId) {
        Optional<Order> optionalOrder = orderRepository.findById(new OrderId(fromString(orderId)));
        if (optionalOrder.isEmpty()) {
            log.error("Could not find order with id: {}", orderId);
            throw new OrderNotFoundException(format("Could not find order with id: %s", orderId));
        }
        return optionalOrder.get();
    }

    void saveOrder(Order order) {
        orderRepository.save(order);
    }

    SagaStatus orderStatusToSagaStatus(OrderStatus orderStatus) {
        return switch (orderStatus) {
            case PAID -> PROCESSING;
            case APPROVED -> SUCCEEDED;
            case CANCELLING -> COMPENSATING;
            case CANCELLED -> COMPENSATED;
            default -> STARTED;
        };
    }
}