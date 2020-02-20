/**
 * Copyright (c) 2020 Asaitec
 */
package com.asaitec.challenge.model;


/**
 * The PromotionFactory class create the right Promotion instance depending of 
 * its type
 * 
 * @author Angel David Macho
 * 
 */
public class PromotionFactory {
    
    
    /**
     * PromotionFactory's constructor
     */
    public PromotionFactory() {
        super();
    }

    
    /** 
     *  Get object of type Promotion
     *
     *  @param  id              unique id of promotion
     *          promotionType   type of promotion
     *          properties      properties of this type of promotion
     *  @return                 a Promotion object
     */
    public static Promotion getPromotion(PromotionType promotionType){
       if(promotionType == null){
          return null;
       }     
       

       if(promotionType.equals(PromotionType.BUY_X_PAY_Y_)){
          // TODO: return BUY_X_PAY_Y_ object
       } else if(promotionType.equals(PromotionType.BUY_X_FREE_PRODUCT)){
          // TODO: return BUY_X_FREE_PRODUCT object
       } else if(promotionType.equals(PromotionType.PRICE_OVERRIDE)){
          // TODO: return PRICE_OVERRIDE object
       }

       return null;
    }

}
