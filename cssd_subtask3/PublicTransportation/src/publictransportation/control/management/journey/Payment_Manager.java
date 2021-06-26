/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportation.control.management.journey;

import publictransportation.models.*;
import java.io.*;

public class Payment_Manager {
    
    private static Set_Of_Costs setOfCosts = new Set_Of_Costs();
    private static Set_Of_Offers setOfOffers = new Set_Of_Offers();
    
    private static Payment_Manager uniqueInstance= new Payment_Manager();
    
    public Payment_Manager(){
        
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
    
    
    public static Payment_Manager getInstance(){
        return uniqueInstance;
    }
    
    
}
