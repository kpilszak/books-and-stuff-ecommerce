package com.kpilszak.booksandstuffecommerce.service;

import com.kpilszak.booksandstuffecommerce.dto.Purchase;
import com.kpilszak.booksandstuffecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
