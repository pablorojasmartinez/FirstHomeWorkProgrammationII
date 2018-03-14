/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Data;

import Domain.Employee;
import Domain.Vehicle;

/**
 * 
 * @author Pablo Rojas Martínez
 */
public class Node {
    
    private Employee employee;
    private Node nextPtr, previosPtr;

      public Node() {
        this.employee = new Employee();
        this.nextPtr = null;
        this.previosPtr = null;
    }//const

    public Node(Employee employee, Node nextPtr, Node previosPtr) {
        this.employee = employee;
        this.nextPtr = nextPtr;
        this.previosPtr = previosPtr;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Node getNextPtr() {
        return nextPtr;
    }

    public void setNextPtr(Node nextPtr) {
        this.nextPtr = nextPtr;
    }

    public Node getPreviosPtr() {
        return previosPtr;
    }

    public void setPreviosPtr(Node previosPtr) {
        this.previosPtr = previosPtr;
    }

  
    
    
    
}
