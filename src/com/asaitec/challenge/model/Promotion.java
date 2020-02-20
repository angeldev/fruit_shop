/**
 * Copyright (c) 2020 Asaitec
 */
package com.asaitec.challenge.model;

/**
 * The Promotion class is a base class for all promotions, having common 
 * attributes
 * 
 * @author Angel David Macho
 * 
 */
public abstract class Promotion {

    /** An unique id of the promotion */
    private String id;
    
    
    /** String representation of promotion's type */
    private PromotionType type;
    
    
    public static Promotion getPromotion() {
        // TODO: return object from factory
        return null;
    }

    
    /** 
     *  Promotion's constructor
     */
    protected Promotion() {
        super();
    }

    
    /** 
     *  Promotion's constructor
     *
     *  @param  id      unique id representation of the promotion
     *          type    type of the promotion
     */
    protected Promotion(String id, PromotionType type) {
        super();
        this.id = id;
        this.type = type;
    }
    

    /** 
     *  Promotion's constructor
     *
     *  @param  id      unique id representation of the promotion
     *          type    type of the promotion
     */
    protected Promotion(String id, String type) {
        super();
        this.id = id;
        this.type = PromotionType.valueOf(type);
    }
    
    
    /** 
     *  Apply promotion to product
     *
     *  @param  product    product to apply promotion
     *          product    product with promotion applied
     */
    public abstract Product apply(Product product);


    public String getId() {
        return id;
    }


    public PromotionType getType() {
        return type;
    }

    
    @Override
    public String toString() {
        return "Promotion [id=" + id + ", type=" + type.toString() + "]";
    }
    
}
