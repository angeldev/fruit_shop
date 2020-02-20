package com.asaitec.challenge.app;

import com.asaitec.challenge.client.ProductsClient;
import com.asaitec.challenge.model.Cart;

public class App {

    public static void main(String[] args) {
        // Create supermarket store data base
        ProductsClient productsClient = new ProductsClient();
        System.out.println(productsClient.getProducts());
        // Create cart of the user
        Cart cart = new Cart();
        System.out.println(cart.getProducts());
    }

}
