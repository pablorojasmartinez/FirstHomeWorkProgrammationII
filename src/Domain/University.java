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
public class University {
    
    private Employee employee;
    private Vehicule vehicule;
   private int amountEmployee;
   private String identification;
   private String ubication;
   
   public University(){
           this.employee = null;
        this.vehicule =null;
        this.amountEmployee = 0;
        this.identification = "";
        this.ubication = "";
   }

    public University(Employee employee, Vehicule vehicule, int amountEmployee, String identification, String ubication) {
        this.employee = employee;
        this.vehicule = vehicule;
        this.amountEmployee = amountEmployee;
        this.identification = identification;
        this.ubication = ubication;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public int getAmountEmployee() {
        return amountEmployee;
    }

    public void setAmountEmployee(int amountEmployee) {
        this.amountEmployee = amountEmployee;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getUbication() {
        return ubication;
    }

    public void setUbication(String ubication) {
        this.ubication = ubication;
    }
    
    

    @Override
    public String toString() {
        return "University\n" + "Employee=" + this.employee + " Vehicule=" + this.vehicule + " Amount of Employees=" + this.amountEmployee + " Identification=" +this. identification + ", ubication=" + this.ubication + '}';
    }

   
   

}
