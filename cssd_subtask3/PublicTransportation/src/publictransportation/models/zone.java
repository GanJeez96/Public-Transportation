/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportation.models;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author Gangesh
 */
public class zone extends Vector<zone> implements Serializable {
    
    private String zoneid;
    private String zoneName;
    
    
//    public zone(String id, String name)
//    {
//        this.zoneid=id;
//        this.zoneName=name;
//    }
    
   //testing for zone class array of objects
    public void setIdName(String id, String name)
    {
        this.zoneid=id;
        this.zoneName=name;
    }
    
    public void addZone(zone z)
    {
        super.add(z);
    }
    
    public void removeZone(String zoneID)
    {
        for(int i=0;i<super.size();i++)
        {
            if(zoneID==(super.get(i).getZoneId()))
            {
                super.remove(i);
            }
        }
    }
    
    public zone searchZone(String zoneName)
    {
        zone havzone = new zone();
        for(int i=0;i<super.size();i++)
        {
            if(zoneName.equals(super.get(i).getZoneName()))
            {
                havzone=super.get(i);
            }
        }
        return havzone;
    }
    
    public void editZone(String id, String name)
    {
        this.zoneid=id;
        this.zoneName=name;
    }
    
    public String getZoneName()
    {
        return zoneName;
    }
    
    public String getZoneId()
    {
        return zoneid;
    }
    
    
    
}
