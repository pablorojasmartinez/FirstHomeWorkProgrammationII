/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Domain;

/**
 * 
 * @author Pablo Rojas Martínez
 */
public class Employee {
    
    private String name;
    private String wage;
    private String lastname;
    private String id;

    public Employee() {
        this.name = "";
        this.wage = "";
        this.lastname = "";
        this.id = "";
    }
    
    public Employee(String name, String lastname, String id, String wage) {
        this.name = name;
        this.wage = wage;
        this.lastname = lastname;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee:" + " Name=" +this. name +  "\tLastname=" + this.lastname + "\t\tId=" + this.id + "\tWage=" + this.wage+ '\n';
    }
     
    

}
