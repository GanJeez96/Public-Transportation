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

public class Transaction_History extends ArrayList<Transaction_Record>  implements Serializable {
   
    
    public Transaction_History(){
        super();
    
    }
    public void addTransactionHistory(String accountid,String Ammount)
    {
      String y =GetTransactionRecord(accountid).getAmount()+Ammount;
      String p=GetTransactionRecord(accountid).getAccountID();
      System.out.println(y);
      System.out.println(p);
       Transaction_Record Tr=new Transaction_Record(p,y);
         super.add(Tr);
        
    }
    
    public Transaction_Record GetTransactionRecord(String accountid) 
    {
        for(int x = 0; x < super.size(); x++)
        {
            if (super.get(x).getAccountID().contains(accountid))
            {
                return super.get(x);
            }
        }
        return null;
    }
    public String GetBalance(String Accountid){
        
       return GetTransactionRecord(Accountid).getAmount();
                
    
    }
}
