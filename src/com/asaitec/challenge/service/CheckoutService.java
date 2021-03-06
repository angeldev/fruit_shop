/**
 * Copyright (c) 2020 Asaitec
 */
package com.asaitec.challenge.service;

import com.asaitec.challenge.model.Cart;
import com.asaitec.challenge.model.Checkout;

/**
 * The <code>CheckoutServiceImpl</code> class contains the business logic of 
 * the service.
 * 
 * @author angeldavid
 *
 */
public interface CheckoutService {
    
    
    /**
     * Create a final checkout of the basket, summarizing a list of products, 
     * a total amount to pay and the amount of money the user is saving with
     * promotions.
     * 
     * @param   cart        cart to checkout
     * @return  checkout    checkout of cart with list of products and total to pay
     */
    public Checkout checkout(Cart cart);

}
