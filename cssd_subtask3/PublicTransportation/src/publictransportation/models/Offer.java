/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportation.models;

import java.io.Serializable;


public class Offer implements Serializable{

    private String offerId;
    private String offerCriteria;
    private Float discount;
    
    public Offer(String offerId,String offerCriteria,Float discount){
        this.offerId=offerId;
        this.offerCriteria=offerCriteria;
        this.discount=discount;
    }
    
    
    //Getters and Setters
    public void setOfferId(String offerId){
        this.offerId=offerId;
    }
    public String getOfferId(){
        return offerId;
    }
    
    public void setOfferCriteria(String offerCriteria){
        this.offerCriteria=offerCriteria;
    }
    public String getOfferCriteria(){
        return offerCriteria;
    }
    
    public void setDiscount(Float discount){
        this.discount=discount;
    }
    public Float getDiscount(){
        return discount;
    }
}
