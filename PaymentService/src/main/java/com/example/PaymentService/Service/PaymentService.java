package com.example.PaymentService.Service;

import com.example.PaymentService.Entity.CreditCardDetails;
import com.example.PaymentService.Exception.PaymentServiceException;

public interface PaymentService {
    boolean validateCreditCard(CreditCardDetails creditCardDetails) throws PaymentServiceException;
}

