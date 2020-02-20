/**
 * Copyright (c) 2020 Asaitec
 */
package com.asaitec.challenge.service;

import java.util.List;

import com.asaitec.challenge.client.ProductsClient;
import com.asaitec.challenge.model.Cart;
import com.asaitec.challenge.model.Checkout;
import com.asaitec.challenge.model.Product;

/**
 * The <code>CheckoutServiceImpl</code> class is an implementation of 
 * CheckoutService service
 * 
 * @author angeldavid
 *
 */
public class CheckoutServiceImpl implements CheckoutService {

    private ProductsClient productsClient;
    
    private Checkout checkout;
    
 
    /**
     * CheckoutServiceImpl's constructor
     */
    public CheckoutServiceImpl(ProductsClient productsClient) {
        super();
        this.productsClient = productsClient;
        this.checkout = new Checkout();
    }
    
    
    /**
     * CheckoutServiceImpl's constructor
     */
    public CheckoutServiceImpl(ProductsClient productsClient, Checkout checkout) {
        super();
        this.productsClient = productsClient;
        this.checkout = checkout;
    }


    @Override
    public Checkout checkout(Cart cart) {
        for(Product cartProduct: cart.getProducts()) {
            Product product = getProductDetails(cartProduct);
            checkout = updateCheckout(checkout, product);
        }
        return checkout;
    }

  
    /**
     * Get product information
     * 
     * @param   productId  unique id of product
     *          qty     quantity of product
     * @return  product updated with more information
     */
    protected Product getProductDetails(Product cartProduct) {
        Product product = productsClient.getProductById(cartProduct.getId());
        cartProduct.setName(product.getName());
        cartProduct.setPrice(product.getPrice());
        return cartProduct;
    }
    
    
    /**
     * Update checkout values with new product added
     * 
     * @param checkout  checkout to update
     *        product   product to add to the checkout
     * @return          checkout updated
     */
    protected Checkout updateCheckout(Checkout checkout, Product product) {
        checkout.addToQty(product.getQty());
        
        float productTotal = product.getPrice() * product.getQty();
        checkout.addToTotal(productTotal);
        
        checkout.addToTotalPromo(product.getSaved());
        
        checkout.addProduct(product);
        
        return checkout;
    }

}
