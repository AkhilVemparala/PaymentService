package com.example.PaymentService.Service;
import com.example.PaymentService.Entity.CreditCardDetails;
import com.example.PaymentService.Exception.PaymentServiceException;
import com.example.PaymentService.Repository.CreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private CreditCardRepository creditCardRepository;

    @Override
    public boolean validateCreditCard(CreditCardDetails dto) throws PaymentServiceException {
        CreditCardDetails card = creditCardRepository.findById(dto.getCardNumber())
                .orElseThrow(() -> new PaymentServiceException("Card not found with number: " + dto.getCardNumber()));

        return dto.getCardHolderName().equals(card.getCardHolderName()) &&
                dto.getCvv().equals(card.getCvv()) &&
                dto.getApin().equals(card.getApin());
    }
}

