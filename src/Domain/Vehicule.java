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
public class Vehicule {

    private String brand;
    private String color;
    private int speed;
    private int year;
    private int mileage;
    private boolean use;
    private String notAvailableDate;

    public Vehicule(){
        this.brand ="";
        this.color = "";
        this.speed = 0;
        this.year=0;
        this.mileage = 0;
        this.use = false;
        this.notAvailableDate = "";
    }
    
    public Vehicule(String brand, String color, int speed,int year, int mileage, boolean use, String notAvailableDate) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
        this.year=year;
        this.mileage = mileage;
        this.use = use;
        this.notAvailableDate = notAvailableDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public boolean getUse() {
        return use;
    }

    public void setUse(boolean use) {
        this.use = use;
    }

    public String getNotAvailableDate() {
        return notAvailableDate;
    }

    public void setNotAvailableDate(String notAvailableDate) {
        this.notAvailableDate = notAvailableDate;
    }

    @Override
    public String toString() {
        return "Vehicule: " + "Brand=" + brand + " Color=" + color + " Speed=" + speed + " Year=" + year + " Mileage=" + mileage + " Use=" + use + " Not Available Date=" + notAvailableDate;
    }
    
    
    

   
    
    
    
}
