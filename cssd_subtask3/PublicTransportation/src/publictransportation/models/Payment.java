/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportation.models;

/**
 *
 * @author Sumith
 */
public class Payment {
    private String Payment_ID;
    private String Payment_Type;
    private String Payment_Amount;
    private boolean isSuccessful;
    
    public Payment(String id,String type,String ammount,boolean is ){
    
    Payment_ID=id;
    Payment_Type=type;
    Payment_Amount=ammount;
    isSuccessful=is;
    
    
    }
    
    public Payment(){}
    
    public String getPayment_ID(){
        return Payment_ID;
    
    }
     public String getPayment_Type(){
        return Payment_Type;
    
    }
      public String getPayment_Amount(){
        return Payment_Amount;
    
    }
   
   
    
    
    public boolean getIsSuccessful(){
      return true;
    
    
    }
    
}
