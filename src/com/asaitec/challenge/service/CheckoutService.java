/**
 * Copyright (c) 2020 QikServe
 */
package com.asaitec.challenge.service;

import com.qikserve.challenge.model.Cart;
import com.qikserve.challenge.model.Checkout;

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
     * @return  checkout    checkout of cart with list of items and total to pay
     */
    public Checkout checkout(Cart cart);

}
