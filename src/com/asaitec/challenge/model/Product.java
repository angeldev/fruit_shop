/**
 * Copyright (c) 2020 Asaitec
 */
package com.asaitec.challenge.model;

import java.util.ArrayList;
import java.util.List;

/**
 * The Product class is a representation of supermarket's products that users can buy
 * 
 * @author Angel David Macho
 * 
 */
public class Product {
    
    /** An unique id of the product */
    private String id;
    
    
    /** Name of the product */
    private String name;
    
    
    /** Price of a single product, expressed in euros */
    private float price;
    
    
    /** Money saved because of promotions, expressed in euros */
    private int saved;
    
    
    /** Number of products added to cart */
    private int qty;
    
    
    /** Promotions of the product */
    private List<Promotion> promotions = new ArrayList<>();

    
    /** 
     *  Product's constructor
     */
    public Product() {
        super();
    }


    /** 
     *  Product's constructor
     *
     *  @param  id      unique id representation of the product
     *          name    name of the product
     *          price   price of the product
     */
    public Product(String id, String name, int price, int qty, 
            List<Promotion> promotions) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.promotions = promotions;
    }
    
    /** 
     *  Product's constructor, create an object with an String
     *
     *  @param  product      a string with product info
     */
    public Product(String product) {
        super();
        String[] attributes = product.split(",");
        if (attributes.length == 3) {
            this.id = attributes[0];
            this.name = attributes[1];
            this.price = Float.parseFloat(attributes[2]);
            this.qty = 0;
            this.promotions = null;
        } else if(attributes.length == 2) {
            this.id = attributes[0];
            this.name = null;
            this.price = 0;
            this.qty = Integer.parseInt(attributes[1]);
            this.promotions = null;
        }
    }
    
    public String getId() {
        return id;
    }

    
    public void setId(String id) {
        this.id = id;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public float getPrice() {
        return price;
    }
    

    public void setPrice(float price) {
        this.price = price;
    }
    
    
    public int getSaved() {
        return saved;
    }


    public void setSaved(int saved) {
        this.saved = saved;
    }


    public int getQty() {
        return qty;
    }

    
    public void setQty(int qty) {
        this.qty = qty;
    }
    
    
    public List<Promotion> getPromotions() {
        return promotions;
    }

    
    public void setPromotions(List<Promotion> promotions) {
        this.promotions = promotions;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price
                + ", saved=" + saved + ", qty=" + qty + ", promotions="
                + promotions + "]";
    }

    
}
