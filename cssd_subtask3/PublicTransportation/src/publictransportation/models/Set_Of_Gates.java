/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportation.models;

import publictransportation.models.Gate;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Gangesh
 */
public class Set_Of_Gates implements Serializable {
    
    private String Set_Of_Gate_ID;
    private String StopID;
    ArrayList<Gate> Gates = new ArrayList<Gate>();
    
    public Set_Of_Gates()
    {
        
    }
    
    public Set_Of_Gates(String gatesID, String stopid)
    {
        this.Set_Of_Gate_ID=gatesID;
        this.StopID=stopid;
    }
    
    public String getGatesID()
    {
        return this.Set_Of_Gate_ID;
    }
    
    public String getStopID()
    {
        return this.StopID;
    }
            
    
    
    public void addGate(Gate g)
    {
        Gates.add(g);
    }
    
    public void removeGate(String gateid)
    {
        for(int i=0;i<Gates.size();i++)
        {
            if(gateid.equals(Gates.get(i).getGateID()))
            {
                Gates.remove(i);
            }
        }
    }
    
    public ArrayList<Gate> getGates()
    {
        return this.Gates;
    }
    
//    public void searchGate(String gateid)
//    {
//        Gate reGate=new Gate();
//        for(int i=0;i<Gates.size();i++)
//        {
//            if(gateid.equals(Gates.get(i).getGateID()))
//            {
//                Gates.remove(i);
//            }
//        }
//    }
    
    
}
