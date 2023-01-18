package dal;

import model.Employee;

public class EmployeeManager {
    public Employee employee;
    public int profit = 0;

    public EmployeeManager(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int calculateProfitByTicket(int ticketPrice, int percentage){
        int profitByTicket = percentage * 100 / ticketPrice;
        profit += profitByTicket;
        return profitByTicket;
    }

    public int calculateSalary(){
        employee.setSalary(profit);
        return profit;
    }
}
