package com.valueobject;

import java.util.UUID;

public class OrderId<ID> extends BaseId<UUID> {

    public OrderId(UUID value) {
        super(value);
    }
}
