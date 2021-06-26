/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportation.models;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Kavindu Gayashan
 */
public class Set_Of_Tokens extends ArrayList<Token> implements Serializable{
    
    public Set_Of_Tokens(){
        super();
    }
    
    public void addToken(Token token){
        super.add(token);
    }
    
    /**
     * This function will accept the tokenID and set its IsUsed state to true
     * @param tokenID 
     */
    public void setUsed(int tokenID){
        
        for(int i=0;i<this.size();i++){
            
            if(this.get(i).getToken_ID()==tokenID){
                this.get(i).setIsUsed(true);
                
            }   
        }
    }
    
    /**
     * This function will accept a tokenID and check its validity and if its valid, it will set that it is used.
     * @param tokenID
     * @return Boolean validity
     */
    public Boolean validateToken(int tokenID){
        for(int i=0;i<this.size();i++){
            
            if(this.get(i).getToken_ID()==tokenID){
                if(this.get(i).getIsUsed()){
                    return false;
                }else{
                    this.setUsed(tokenID);
                    return true;
                }
            }   
        }
        return false;
    }
    
}
