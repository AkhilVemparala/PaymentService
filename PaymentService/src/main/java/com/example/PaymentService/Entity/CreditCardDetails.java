package com.example.PaymentService.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "CREDITCARD_DETAILS")
public class CreditCardDetails {
    @Id
    private String cardNumber;

    private String cardHolderName;
    private String cvv;
    private String apin;
    private String expiryMonth;
    private String expiryYear;
    private String totalBill;

    // Getters and Setters
    // toString()
}
