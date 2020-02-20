package com.asaitec.challenge.app;

import com.asaitec.challenge.client.ProductsClient;
import com.asaitec.challenge.model.Cart;
import com.asaitec.challenge.model.Checkout;
import com.asaitec.challenge.service.CheckoutService;
import com.asaitec.challenge.service.CheckoutServiceImpl;

public class App {

    public static void main(String[] args) {
        // Create supermarket store data base
        ProductsClient productsClient = new ProductsClient();
        
        // Create cart of the user
        Cart cart = new Cart();
        
        // Checkout the cart
        CheckoutService checkoutService = new CheckoutServiceImpl(productsClient);
        System.out.println(checkoutService.checkout(cart));
    }

}
