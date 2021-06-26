/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportation.models;

import java.util.ArrayList;

/**
 *
 * @author Randika
 */
public class Set_Of_Breakdowns extends ArrayList<Breakdown>{
    
    public void addBreakdown(Breakdown abreak) {
        super.add(abreak);

    }
    ArrayList<Breakdown> temp = new ArrayList<Breakdown>();
    
    public ArrayList<Breakdown> checkBreakdownType(String type){
        for(int i=0;i<this.size();i++){
            
            
            if(this.get(i).getType().equals(type))
            {
               temp.add(this.get(i));
                
            }
              
             
        }
        return temp;
    }
}
     
