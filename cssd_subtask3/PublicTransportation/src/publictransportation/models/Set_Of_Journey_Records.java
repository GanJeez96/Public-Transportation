/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportation.models;

import java.util.ArrayList;
/**
 *
 * @author Kutoma
 */ 
public class Set_Of_Journey_Records extends ArrayList<Journey_Record> {


public Set_Of_Journey_Records(){

    super();
}

public void addSchedule(Journey_Record aSchedule){
    super.add(aSchedule);
}

}
