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
public class User  implements Serializable {
     
    private String name;
    private String email;
     private String address;
    private String password;
     private String city;
     
     public User(String n, String e ,String a, String p,String c){
     name=n;
     email=e;
     address=a;
     password=p;
     city=c;
     
     
     
     }
     
     
      public String getName(){
        return name;
    }
    
    public void setName(String n){
        name = n;
    }
     public String getEmail(){
        return email;
    }
    
    public void setEmail(String e){
        email = e;
    }
     public String getAddress(){
        return address;
    }
    
    public void setAddress(String a){
        address=a;
    }
     public String getPassword(){
        return password;
    }
    
    public void setPassword(String p){
        password=p;
    }
     public String getCity(){
        return city;
    }
    
    public void setCity(String c){
       city=c;
    }
}


