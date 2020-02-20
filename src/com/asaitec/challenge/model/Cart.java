/**
 * Copyright (c) 2020 Asaitec
 */
package com.asaitec.challenge.model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.asaitec.challenge.util.Utils;

/**
 * The Class  is a representation of supermarket's cart where users put 
 * items they are going to buy
 * 
 * @author Angel David Macho
 * 
 */
public class Cart {
    
    private final String filePath = "src/com/asaitec/challenge/res/cart";
    
    /** File where products are stored */
    private final File file = new File(filePath);
    
    /** Products in the cart */
    private List<Product> products = new ArrayList<>();

    
    /**
     *  Cart's constructor
     */
    public Cart() {
        super();
        fillCart();
    }
    
    /**
     * Fill cart with file data
     */
    private void fillCart() {
        List<String> lines = Utils.getLines(file);
        for (String line : lines) {
            Product product = new Product(line);
            addToCart(product);
        }
    }
    
    
    public List<Product> getProducts() {
        return products;
    }
    

    /**
     * Add to product to cart
     * 
     * @param product  product to add
     */
    public void addToCart(Product product) {
        products.add(product);
    }


    @Override
    public String toString() {
        return "Cart [products=" + products + "]";
    }

}
