/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportation.models;

/**
 *
 * @author Kavindu Gayashan
 */
public class PayPalPayment {
    private String paypalID;
    private String password;
    private Float amount;

    public PayPalPayment() {
    }
    
    public PayPalPayment(String paypalID,String password,Float amount){
        this.paypalID=paypalID;
        this.password=password;
        this.amount=amount;
    }
}
