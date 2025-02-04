package com.kpilszak.booksandstuffecommerce.controller;

import com.kpilszak.booksandstuffecommerce.dto.Purchase;
import com.kpilszak.booksandstuffecommerce.dto.PurchaseResponse;
import com.kpilszak.booksandstuffecommerce.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {
    private final CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {
        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }
}
