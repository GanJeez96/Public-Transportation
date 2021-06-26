/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package publictransportation.models;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Kutoma
 */
public class Journey_Record implements java.io.Serializable{

    private String sstop;
    private String dstop;
    private String date;
    private String time;
   
    public Journey_Record(String name){
      
    }

    Journey_Record() {
         
    }
    
    public String getRoutename() {
        return sstop;
    }

 
    public String getDeptime() {
        return dstop;
    }
    public String getArrtime() {
        return date;
    }
    
    public String getStatus(){
        return this.time;
    }
    
    public Journey_Record(String routename, String arrtime, String status)
    {
       this.sstop=routename;
       //his.dstop=deptime;
       this.date=arrtime;
       this.time=status;
    }

    
    

    
}
