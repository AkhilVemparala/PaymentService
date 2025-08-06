package com.example.PaymentService.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus( HttpStatus.BAD_REQUEST)
public class PaymentServiceException extends RuntimeException {

    public PaymentServiceException(String message)  {
        super(message);
    }
}
