package com.exception;

public class DomainException extends RuntimeException {

    public DomainException(String message) {
    }

    public DomainException(String message, Throwable cause) {
        super(message, cause);
    }
}
