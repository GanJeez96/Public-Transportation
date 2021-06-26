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
public class Account extends ArrayList<User>  implements Serializable {
    //Transaction_Record TR = new Transaction_Record();
    private String username;
    Transaction_History TH =new Transaction_History();
     public Account()
    {
        super();
    }
    
    public void addUser(User aUser)
    {
        super.add(aUser);
    }    
     public User checkCredentials(String username , String password) 
    {
        for(int x = 0; x < super.size(); x++)
        {
            if ((super.get(x).getEmail().contains(username))&&(super.get(x).getPassword().contains(password)))
            {
                return super.get(x);
            }
        }
        return null;
    }
     
     public void addToTransactionHistory(String Accountid,String amount){
         if(createPaymentObject().getIsSuccessful()==true)
         TH.addTransactionHistory(Accountid, amount);
         
         
                         }
     
     Payment createPaymentObject(){
         
     Payment pa=new Payment();
     return pa;
     
     
     }
     public void topUpBalance(Payment pay){
     
     
     
     }
     
     public String getUsername(User us){
         
         return us.getEmail();
     
     
     
     }
     
     public Transaction_Record createTopUpTransaction(String Amount ,String username){
                    
     Transaction_Record TR1 = new Transaction_Record(Amount,username);
                return TR1;
     
     
     
     }
    
      
                
    
    
    
}
