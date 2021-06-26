/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportation.control;

import publictransportation.models.*;
import java.io.*;

public class Payment_Manager {
    
    private static Set_Of_Costs setOfCosts = new Set_Of_Costs();
    private static Set_Of_Offers setOfOffers = new Set_Of_Offers();
    
    private static Payment_Manager uniqueInstance= new Payment_Manager();
    
    public Payment_Manager(){
        
    }
    
    //This function will refresh the Set_Of_Costs and Set_Of_Offers
    
    public void refreshPaymentManager(){
         //Deserializing costs and offers
        try{
            System.out.println("Deserializing costs and offers");
            FileInputStream fileInputCosts= new FileInputStream("Costs.ser");
            ObjectInputStream objectInputCosts= new ObjectInputStream(fileInputCosts);
            setOfCosts=(Set_Of_Costs) objectInputCosts.readObject();
            objectInputCosts.close();
            fileInputCosts.close();
            
            FileInputStream fileInputOffers= new FileInputStream("Offers.ser");
            ObjectInputStream objectInputOffers= new ObjectInputStream(fileInputOffers);
            setOfOffers=(Set_Of_Offers) objectInputOffers.readObject();
            objectInputOffers.close();
            fileInputOffers.close();
            
            System.out.println("Deserialized costs and offers");
        }
        catch(Exception e){
            System.out.println("Couldn't deserialize costs and offers Error:"+e.getMessage());
        }
    }
    
    
    /**
     * This will return the unique instance of the payment manager which was created eagerly at the beginning
     * @return Payment_Manager uniqueInstance
     */
    public static Payment_Manager getInstance(){
        return uniqueInstance;
    }
    
    
    
    /**
     * This function will check for the ticket price of tourists (Discount is being deducted)
     * @param source String value of source stop
     * @param destination String value of destination stop
     * @return float TotalPrice to be paid
     */
    public Float lookupCost(String source,String destination){
        
         float jcost=setOfCosts.calculateCost(source, destination);
         //this will get any offers available for tourists
         float discount= setOfOffers.checkOffers("Tourist");
         
         float totPrice= jcost - (float)(jcost*(discount/100.0));
         return totPrice;
        
    }
    
    
    /**
     * This function will return the price of ticket without applying any discount
     * @param source
     * @param destination
     * @return float TicketPrice
     */
    public Float getTicketPrice(String source,String destination){
        return setOfCosts.calculateCost(source, destination);
    }
    
    
    /**
     * this function will return the discount of offer criteria. In this method, Tourist is the default criteria
     * @return float DiscountPercentage
     */
    public Float getAppliedDiscount(){
        
        return setOfOffers.checkOffers("Tourist");
    }
    
    
    /**
     * This function will return the state of payment validation
     * @param payment PayPalPayment object is initialized in the calling class and passed
     * @return boolean the state of payment verification
     */
    public Boolean validatePayment(PayPalPayment payment){
        //validating the payment from external source
        return new External_Payment_Validation().validatePayment(payment);
        
    }
    
}
