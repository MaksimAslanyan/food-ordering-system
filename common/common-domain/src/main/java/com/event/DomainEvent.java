package com.event;

public interface DomainEvent<T> {

    void fire();
}
