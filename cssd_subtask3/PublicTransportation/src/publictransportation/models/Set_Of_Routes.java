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

import java.io.Serializable;
import java.util.ArrayList;

public class Set_Of_Routes extends ArrayList<Route> implements Serializable{
    
    
    public Set_Of_Routes(){
        super();
    }
    
    public void addNewRoute(Route route){
        super.add(route);
    }
    
    public void deleteRoute(String routeId){
        
        for(int i=0;i<this.size();i++){
            
            if(this.get(i).getRoute_ID().equals(routeId)){
                this.remove(this.get(i));
            }   
        }
    }
    
    /**
     * This function will return all the Stops
     * @return  ArrayList<String> Includes all the stops
     */
    public ArrayList<String> getAllSourceStops(){
        ArrayList<String> sourceStops=new ArrayList<String>();
        ArrayList<Stop> temp = new ArrayList<Stop>();
        
        for(int i=0;i<this.size();i++){
            temp=this.get(i).getStops();
            
            for(int j=0;j<temp.size();j++){
                sourceStops.add(temp.get(j).getStopName());
            }
        }
        return sourceStops;
        
    }
    
    /**
     * This function will check the route of a given stop and return all the other stops of that route
     * @param source String Stop name
     * @return ArrayList<String> all the stops of that particular route
     */
    public ArrayList<String> getDestinations(String source){
        ArrayList<String> destinations=new ArrayList<String>();
        ArrayList<Stop> temp = new ArrayList<Stop>();
        
        for(int i=0;i<this.size();i++){
            
            temp=this.get(i).getStops();
            
            for(int j=0;j<temp.size();j++){
                
                if(temp.get(j).getStopName().equals(source)){
                    for(int k=0;k<temp.size();k++){
                        destinations.add(temp.get(k).getStopName());
                    } 
                }
            }  
        }
        return destinations;
    }
    
    public Route getStopsinRoute(String routename)
    {
        Route foundroute =new Route();
        for(int i=0;i<super.size();i++)
        {
            if(routename.equals(super.get(i).getName()))
            {
                foundroute=super.get(i);
            }
        }
        return foundroute;
    }
    
    
}
