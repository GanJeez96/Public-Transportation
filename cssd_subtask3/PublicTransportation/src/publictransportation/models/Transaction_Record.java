/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportation.models;
import java.io.Serializable;
import java.util.ArrayList;
import java.io.*;


/**
 *
 * @author Sumith
 */
public class Transaction_Record implements Serializable {
    
  private String Amount;
  private String AccountID;
    public Transaction_Record(String amount,String accountid){
         Amount=amount;
         AccountID=accountid;
    
    
    }
     public String getAmount(){
        return Amount;
    }
    
    public void setAmount(String n){
        Amount = n;
    }
     public String getAccountID(){
        return AccountID;
    }
    
    public void setAccountID(String n){
        AccountID= n;
    }
}
