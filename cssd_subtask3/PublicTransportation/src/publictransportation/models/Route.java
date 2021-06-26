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
 * @author Gangesh
 */
public class Route implements Serializable{

    
    
    private String Route_ID;
    private String Name;
    private String route_type;
    ArrayList<Stop> Stops = new ArrayList<Stop>();
   // ArrayList<Journey_Record> Journeys = new ArrayList<Journey_Record>();
    //ArrayList<Transport_Vehicle> Vehicles = new ArrayList<Transport_Vehicle>();
    
    //default constructor
    public Route()
    {
        
    }
    
    public Route(String id, String name,String rtype)
    {
        this.Route_ID=id;
        this.Name= name;
        this.route_type=rtype;
    }
    
    public void addStops(Stop s)
    {
        Stops.add(s);
    }
    
//    public void addVehicles(Transport_Vehicle v)
//    {
//        Vehicles.add(v);
//    }
    
    public ArrayList<Stop> getStops()
    {
        return this.Stops;
    }
    
    
    /**
     * @return the Route_ID
     */
    public String getRoute_ID() {
        return Route_ID;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @return the route_type
     */
    public String getRoute_type() {
        return route_type;
    }

        
}
