package com.kpilszak.booksandstuffecommerce.service;

import com.kpilszak.booksandstuffecommerce.dao.CustomerRepository;
import com.kpilszak.booksandstuffecommerce.dto.Purchase;
import com.kpilszak.booksandstuffecommerce.dto.PurchaseResponse;
import org.springframework.stereotype.Service;

@Service
public class CheckoutServiceImpl implements CheckoutService {
    private CustomerRepository customerRepository;

    public CheckoutServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    @Override
    public PurchaseResponse placeOrder(Purchase purchase) {
        return null;
    }
}
