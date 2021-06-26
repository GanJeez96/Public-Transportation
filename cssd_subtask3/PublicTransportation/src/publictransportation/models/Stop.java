/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportation.models;

import java.io.Serializable;
import java.util.ArrayList;
//test
/**
 *
 * @author Gangesh
 */
public class Stop implements Serializable {
    
    private String Stop_ID;
    private String Zone_ID;
    private String Name;
    private double Latitude;
    private double Longtitude;
    
    //private ArrayList<Stop> allstops = new ArrayList<Stop>();
    
    
    public void newStop(String stopID,String zoneID,String name,double lat, double lon)
    {
        this.Stop_ID=stopID;
        this.Zone_ID=zoneID;
        this.Name=name;
        this.Latitude=lat;
        this.Longtitude=lon;
    }
    
//    public void addStop(Stop s)
//    {
//        allstops.add(s);
//    }
//            
//    public ArrayList<Stop> getAllStops()
//    {
//        return allstops;
//    }
    
    public String getStopID()
    {
        return this.Stop_ID;
    }
    
    public String getZoneID()
    {
        return this.Zone_ID;
    }
    
    public String getStopName()
    {
        return this.Name;
    }
    
    public double getLat()
    {
        return this.Latitude;
    }
    
    public double getLon()
    {
        return this.Longtitude;
    }
    
}
