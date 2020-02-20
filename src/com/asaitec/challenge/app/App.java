package com.asaitec.challenge.app;

import com.asaitec.challenge.client.ProductsClient;
import com.asaitec.challenge.model.Cart;
import com.asaitec.challenge.model.Product;

public class App {

    public static void main(String[] args) {
        // Create supermarket store data base
        ProductsClient productsClient = new ProductsClient();
        
        // Create cart of the user
        Cart cart = new Cart();
        
        // Get details of products in the cart
        for(Product cartProduct: cart.getProducts()) {
            Product product = productsClient.getProductById(cartProduct.getId());
            cartProduct.setName(product.getName());
            cartProduct.setPrice(product.getPrice());
        }
    }

}
