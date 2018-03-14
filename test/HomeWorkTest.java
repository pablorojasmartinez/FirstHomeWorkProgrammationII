/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Domain.Employee;
import Domain.University;
import Domain.Vehicle;
import GUI.Menu;
import homework1.HomeWork1;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pablo Rojas Martínez
 */
public class HomeWorkTest {

    public HomeWorkTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void EmployeeTest() {
        Employee e = new Employee("nombre", "apellido", "id", "salario");
        System.out.println(e.toString());
        System.out.println();
    }

    @Test
    public void VehiculeTest() {
        Vehicle v = new Vehicle("marca", "color", 10, 1994, 34, true, "no");
        System.out.println(v.toString());
        System.out.println();
    }

    @Test
    public void UniversityTest() {

        Employee e = new Employee("nombre", "apellido", "id", "salario");
        Vehicle v = new Vehicle("marca", "color", 10, 1994, 34, true, "no");
        University u = new University(e, v, 100, "id", "ubicacion");
        System.out.println(u.toString());
    }
    
}