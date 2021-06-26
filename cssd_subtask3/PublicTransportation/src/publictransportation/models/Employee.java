/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package publictransportation.models;

/**
 *
 * @author Kutoma
 */
public class Employee implements java.io.Serializable{

    public Employee() {
        
    }
    
    public String getName() {
        return name;
    }

    public int getEno() {
        return eno;
    }

   
    public double getSalary() {
        return salary;
    }

    public String getPermlevel() {
        return permlevel;
    }

    private String name;
    private int eno;
    //private SetOfBooks currentLoans = new SetOfBooks();
    private double salary;
    private String permlevel;
    
    public Employee(int id, String eName, double salary, String perm){
     this.eno= id;
     this.name = eName;
     this.salary = salary;
     this.permlevel = perm;
    }
  
 
    
}

