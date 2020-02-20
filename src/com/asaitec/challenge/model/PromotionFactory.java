/**
 * Copyright (c) 2020 Asaitec
 */
package com.asaitec.challenge.model;

import java.util.Map;

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
    public static Promotion getPromotion(String id, PromotionType promotionType, Map<String, Object> properties){
       if(id == null || promotionType == null){
          return null;
       }     
       

       /*if(promotionType.equals(PromotionType.BUY_X_PAY_Y_)){
          return new BuyXGetYFreePromotion(id, promotionType,
                  (int) properties.get("required_qty"), (int) properties.get("free_qty"));
       } else if(promotionType.equals(PromotionType.BUY_X_FREE_PRODUCT)){
          return new QtyBasedPriceOverridePromotion(id, promotionType, 
                  (int) properties.get("required_qty"), (int) properties.get("price"));
       } else if(promotionType.equals(PromotionType.PRICE_OVERRIDE)){
          return new FlatPercentPromotion(id, promotionType,
                  (int) properties.get("amount"));
       }*/

       return null;
    }

}
