package com.example.PaymentService.Controller;

import com.example.PaymentService.Entity.CreditCardDetails;
import com.example.PaymentService.Exception.PaymentServiceException;
import com.example.PaymentService.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/validate")
    public ResponseEntity<Boolean> validateCreditCard(@RequestBody CreditCardDetails dto) throws PaymentServiceException {
        boolean result = paymentService.validateCreditCard(dto);
        return ResponseEntity.ok(result);
    }
}

