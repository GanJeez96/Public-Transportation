/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportation.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Kavindu Gayashan
 */
public class Token implements Serializable{
    
    private int Token_ID;
    private String Source_Stop_ID;
    private String Destination_Stop_ID;
    private LocalDateTime purchasedDate;
    private Boolean isUsed;
    
    //To generate a random token
    private Random rando=new Random();
    private int limittoken=100000000;
    
    public Token(String source, String destination){
        
        //geerating a random token between 0 and 100000000
        this.Token_ID= rando.nextInt(limittoken);
        this.Source_Stop_ID=source;
        this.Destination_Stop_ID=destination;
        this.isUsed=false;
        this.purchasedDate=LocalDateTime.now();
        
    }

    /**
     * @return the Token_ID
     */
    public int getToken_ID() {
        return Token_ID;
    }

    /**
     * @return the Source_Stop_ID
     */
    public String getSource_Stop_ID() {
        return Source_Stop_ID;
    }

    /**
     * @return the Destination_Stop_ID
     */
    public String getDestination_Stop_ID() {
        return Destination_Stop_ID;
    }

    /**
     * @return the purchasedDate
     */
    public LocalDateTime getPurchasedDate() {
        return purchasedDate;
    }

    /**
     * @return the isUsed
     */
    public Boolean getIsUsed() {
        return isUsed;
    }

    /**
     * @param isUsed the isUsed to set
     */
    public void setIsUsed(Boolean isUsed) {
        this.isUsed = isUsed;
    }
    
    
}
