/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportation.models;

import java.io.Serializable;

/**
 *
 * @author Gangesh
 */
public class Gate implements Serializable {
    
    private String Gate_ID;
    private String State;
    
    
    public Gate(String gateid, String state)
    {
        this.Gate_ID=gateid;
        this.State=state;
    }
    
    public Gate()
    {
        
    }
    
    public String getGateID()
    {
        return this.Gate_ID;
    }
    
    public String getState()
    {
        return this.State;
    }
    
    
}
