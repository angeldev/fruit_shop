/**
 * Copyright (c) 2020 QikServe
 */
package com.asaitec.challenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qikserve.challenge.client.ItemsClient;
import com.qikserve.challenge.model.Cart;
import com.qikserve.challenge.model.Checkout;
import com.qikserve.challenge.model.Item;
import com.qikserve.challenge.model.Promotion;

/**
 * The <code>CheckoutServiceImpl</code> class is an implementation of 
 * CheckoutService service
 * 
 * @author angeldavid
 *
 */
@Service
public class CheckoutServiceImpl implements CheckoutService {

    @Autowired
    private ItemsClient itemsClient;
    
    @Autowired
    private Checkout checkout;
    
    
    /**
     * CheckoutServiceImpl's constructor
     */
    public CheckoutServiceImpl() {
        
    }
    
    
    /**
     * CheckoutServiceImpl's constructor
     */
    public CheckoutServiceImpl(ItemsClient itemsClient) {
        super();
        this.itemsClient = itemsClient;
    }
    
    
    /**
     * CheckoutServiceImpl's constructor
     */
    public CheckoutServiceImpl(ItemsClient itemsClient, Checkout checkout) {
        super();
        this.itemsClient = itemsClient;
        this.checkout = checkout;
    }


    @Override
    public Checkout checkout(Cart cart) {
        List<Item> items = cart.getItems();
        for(Item item:items) {
            item = getItemDetails(item.getId(), item.getQty());
            item = applyPromotions(item);
            checkout = updateCheckout(checkout, item);
        }
        return checkout;
    }

    
    /**
     * Apply promotions to item
     * 
     * @param   item  item to apply promotions
     * @return  item with promotions applied
     */
    protected Item applyPromotions(Item item) {
        for (Promotion promotion:item.getPromotions()) {
            promotion.apply(item);
        }
        return item;
    }
    
    
    /**
     * Get item information
     * 
     * @param   itemId  unique id of item
     *          qty     quantity of item
     * @return  item updated with more information
     */
    protected Item getItemDetails(String itemId, int qty) {
        Item item = itemsClient.getItemById(itemId);
        item.setQty(qty);
        return item;
    }
    
    
    /**
     * Update checkout values with new item added
     * 
     * @param checkout  checkout to update
     *        item      item to add to the checkout
     * @return          checkout updated
     */
    protected Checkout updateCheckout(Checkout checkout, Item item) {
        checkout.addToQty(item.getQty());
        
        int itemTotal = item.getPrice() * item.getQty();
        checkout.addToTotal(itemTotal);
        
        checkout.addToTotalPromo(item.getSaved());
        
        checkout.addItem(item);
        
        return checkout;
    }

}
