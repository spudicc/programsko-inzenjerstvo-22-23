package dal;

import model.Employee;

public class EmployeeManager {
    public EmployeeManager() {

    }

    public int calculateProfitByTicket(Employee employee, int ticketPrice, int percentage){
        int profitByTicket = percentage * 100 / ticketPrice;
        employee.profit += profitByTicket;
        return profitByTicket;
    }

    public int calculateSalary(Employee employee){
        employee.setSalary(employee.profit);
        return employee.getSalary();
    }
}
