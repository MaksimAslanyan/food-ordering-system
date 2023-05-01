package com.food.ordering.system.application.exception.handler;


import lombok.Builder;
import lombok.Data;
import org.springframework.web.bind.annotation.ControllerAdvice;

@Data
@Builder
@ControllerAdvice
public class ErrorDTO {

    private final String code;
    private final String message;
}
