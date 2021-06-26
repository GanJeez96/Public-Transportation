/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportation.models;

/**
 *
 * @author KaviDeZeus
 */

import java.io.Serializable;
import java.util.ArrayList;

public class Set_Of_Costs extends ArrayList<Journey_Cost> implements Serializable{
    
    public Set_Of_Costs(){
       super(); 
    }
    
    public void addNewJCost(Journey_Cost cost){
        super.add(cost);
    }
    
    /**
     * This will search though the ArrayList and delete the object that matches its journey ID with the passed journey ID
     * @param journeyId String
     */
    public void deleteJCost(String journeyId){
        
        for(int i=0;i<this.size();i++){
            
            if(this.get(i).getJourneyId().equals(journeyId)){
                this.remove(this.get(i));
            }   
        }
    }
    
    /**
     * This will search through the ArrayList and return the relevant cost
     * @param source String Source Stop
     * @param destination String Destination Stop
     * @return Float cost for the journey
     */
    public Float calculateCost(String source, String destination){
        
        Float jCost=null;
        for(int i=0;i<this.size();i++){
            
            if(this.get(i).getSourceStop().equals(source) && this.get(i).getDestinationStop().equals(destination)){
                jCost=this.get(i).getCost();
            }   
        }
        return jCost;
        
    }
    
}
