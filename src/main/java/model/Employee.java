package model;

public class Employee {
    private String name;
    private int salary;

    public int profit;

    public Employee(String name) {
        this.name = name;
        profit = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
