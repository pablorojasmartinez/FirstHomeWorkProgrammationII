/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Domain.Employee;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Pablo Rojas Martínez
 */
public class FileEmployee {

    ArrayList<Employee> arrayEmployees = new ArrayList<>();
    CircularList generalList = new CircularList();

    File file = new File("employeeFile.csv");

    public void insertFile(Employee employee) {
        boolean fileExists = new File("employeeFile").exists();
        if (fileExists) {
            File newFile = new File("employeeFile");
            newFile.delete();
        }
        try {
            CsvWriter csvOutput = new CsvWriter(new FileWriter(file, true), ',');
            csvOutput.write(employee.getName());
            csvOutput.write(employee.getLastname());
            csvOutput.write(employee.getId());
            csvOutput.write(employee.getWage());
            csvOutput.endRecord();
            csvOutput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//insert

    public ArrayList<Employee> readFile() {
        try {
            CsvReader getEmployee = new CsvReader("employeeFile.csv");
            getEmployee.readHeaders();
            while (getEmployee.readRecord()) {
                Employee newEmployee = new Employee();
                String name = (getEmployee.get(0));
                String lastname = (getEmployee.get(1));
                String id = (getEmployee.get(2));
                String wage = (getEmployee.get(3));
                newEmployee.setName(name);
                newEmployee.setLastname(lastname);
                newEmployee.setId(id);
                newEmployee.setWage(wage);
                generalList.insertInOrder(newEmployee);
                arrayEmployees.add(newEmployee);
            }
            getEmployee.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayEmployees;
    }//leerArchivo
    
    public Employee searchByName(String name){
          for (int i = 0; i < arrayEmployees.size(); i++) {
            if (arrayEmployees.get(i).getName().equals(name)) {
                return arrayEmployees.get(i);
            }
        }
        return null;
    }
    
}//class
