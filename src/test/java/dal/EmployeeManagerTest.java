package dal;

import model.Employee;
import model.Engine;
import model.Vehicle;
import model.VehicleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeManagerTest {

    @Test
    void calculateProfitByTicket() {
        EmployeeManager employeeManager = new EmployeeManager();
        Employee employee = new Employee("Test");
        Vehicle vehicle = new Vehicle(Engine.gas, 30, VehicleType.car);
        assertEquals(10, (employeeManager.calculateProfitByTicket(employee, 100, 10)));

    }

    @Test
    void calculateSalary() {
        EmployeeManager employeeManager = new EmployeeManager();
        Employee employee = new Employee("Test");
        Vehicle vehicle = new Vehicle(Engine.gas, 30, VehicleType.car);
        employeeManager.calculateProfitByTicket(employee, 100, 10);
        employeeManager.calculateProfitByTicket(employee, 100, 10);
        assertEquals(20, employeeManager.calculateSalary(employee));
    }
}