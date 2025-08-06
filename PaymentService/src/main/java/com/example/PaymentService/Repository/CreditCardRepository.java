package com.example.PaymentService.Repository;
import com.example.PaymentService.Entity.CreditCardDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCardDetails, String> {
}