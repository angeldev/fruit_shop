/**
 * Copyright (c) 2020 Asaitec
 */
package com.asaitec.challenge.model;

import java.util.ArrayList;
import java.util.List;

/**
 * The Checkout class is a representation of supermarket's checkout with a list 
 * of products and total to pay
 * 
 * @author Angel David Macho
 * 
 */
public class Checkout {
    
    /** Total amount to be paid without promotions applied */
    private float total;
    
    
    /** Total amount of money the user is saving because of promotions */
    private float totalPromo;
    
    
    /** Total amount to be paid with promotions applied */
    private float totalPayable;
    
    
    /** Quantity of products in the cart */
    private int qty;
    
    
    /** Products in the checkout */
    private List<Product> products = new ArrayList<>();
   

    /**
     *  Checkout's constructor
     */
    public Checkout() {
        
    }
    
    
    /**
     *  Checkout's constructor
     */
    public Checkout(float total, float totalPromo, int qty, List<Product> products) {
        super();
        this.total = total;
        this.totalPromo = totalPromo;
        this.qty = qty;
        this.products = products;
    }


    public float getTotal() {
        return total;
    }
    
    
    /**
     * Add amount to total
     * 
     * @param amount  amount to add
     */
    public void addToTotal(float amount) {
        total += amount;
    }


    public float getTotalPromo() {
        return totalPromo;
    }


    public void setTotalPromo(float totalPromo) {
        this.totalPromo = totalPromo;
    }
    
    
    /**
     * Add amount to total saved
     * 
     * @param amount  amount to add
     */
    public void addToTotalPromo(float amount) {
        totalPromo += amount;
    }


    public float getTotalPayable() {
        return getTotal() - getTotalPromo();
    }

    public int getQty() {
        return qty;
    }


    public void setQty(int qty) {
        this.qty = qty;
    }
    
    
    /**
     * Add to quantity
     * 
     * @param qty  quanity to add
     */
    public void addToQty(int qty) {
        this.qty += qty;
    }


    public List<Product> getProducts() {
        return products;
    }
    
    
    /**
     * Add product to list
     * 
     * @param produc  product to add
     */
    public void addProduct(Product product) {
        products.add(product);
    }


    @Override
    public String toString() {
        return "Checkout [total=" + total + ", totalPromo=" + totalPromo
                + ", totalPayable=" + totalPayable + ", qty=" + qty + ", products="
                + products + "]";
    }
    
}
