/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportation.models;

import java.io.Serializable;
import java.util.ArrayList;


public class Set_Of_Offers extends ArrayList<Offer> implements Serializable{
    
    public Set_Of_Offers(){
       super(); 
    }
    
    public void createNewOffer(Offer offer){
        super.add(offer);
    }
    
    public void deleteOffer(String offerId){
        
        for(int i=0;i<this.size();i++){
            
            if(this.get(i).getOfferId().equals(offerId)){
                this.remove(this.get(i));
            }   
        }
    }
    
    public Float checkOffers(String offerCriteria){
        float discount=0;
        for(int i=0;i<this.size();i++){
            
            if(this.get(i).getOfferCriteria().equals(offerCriteria)){
                discount=this.get(i).getDiscount();
            }   
        }
        return discount;
    }
    
    
    
}
