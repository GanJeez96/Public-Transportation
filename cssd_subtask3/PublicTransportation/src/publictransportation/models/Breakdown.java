/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportation.models;

/**
 *
 * @author Randika
 */
public class Breakdown implements java.io.Serializable{
   

    public Breakdown() {
        
    }
    
    public String getLocation() {
        return location;
    }

    public String getStatus() {
        return status;
    }

   
    public String getDescription() {
        return description;
    }
    public String getType() {
        return type;
    }
    
    private String location;
    private String status;
    private String description;
    private String type;
    
    public Breakdown(String location,String status, String description, String type){
     this.location=location;
     this.status = status;
     this.description = description;
     this.type = type;
    
    }
}
