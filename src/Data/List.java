/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Data.FileEmployee;
import Domain.Employee;
import Data.CircularList;
import java.util.ArrayList;

/**
 *
 * @author Pablo Rojas Martínez
 */
public class List {

    private ArrayList<Employee> generalArray;
    FileEmployee fileEmployee = new FileEmployee();
    CircularList generalList = new CircularList();

    public List() {
        generalArray = fileEmployee.readFile();
        insertInLists();
    }

    public void insertInLists() {
        for (int i = 0; i < generalArray.size(); i++) {
            Employee newEmployee = generalArray.get(i);
            generalList.insertInOrder(newEmployee);
        }
    }

    public ArrayList<Employee> getGeneralArray() {
        return generalArray;
    }

    public void setGeneralArray(ArrayList<Employee> generalArray) {
        this.generalArray = generalArray;
    }

    public FileEmployee getArchivoEmployee() {
        return fileEmployee;
    }

    public void setArchivoEmployee(FileEmployee archivoEmpleado) {
        this.fileEmployee = archivoEmpleado;
    }

    public CircularList getGeneralList() {
        return generalList;
    }

    public void setGeneralList(CircularList generalList) {
        this.generalList = generalList;
    }
    
    

}
