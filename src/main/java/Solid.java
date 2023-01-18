import dal.EmployeeManager;
import dal.Terminal;
import dal.TerminalFactory;
import dal.TicketManager;
import model.*;

import java.util.List;

public class Solid {
    static int zarada = 0;
    static EmployeeManager employeeManager;
    static TicketManager ticketManager;
    public static void main(String[] args) {
        employeeManager = new EmployeeManager();
        ticketManager = new TicketManager();

        Terminal terminal = TerminalFactory.getTerminal();
        List<Employee> employees = terminal.getEmployees();
        List<TrainRide> trainRides = terminal.getTrainRides();

        int vehicleCounter = 1;
        for (TrainRide trainRide: trainRides) {
            for (Vehicle vehicle: trainRide.getVehicles()) {
                System.out.println("Vehicle number " + vehicleCounter++);
                calculateProfit(vehicle);
                calculateEmployeesProfit(vehicle, employees);
                checkChargingStatus(vehicle);
                System.out.println("\n\n");
            }
        }

        for (Employee employee: employees) {
            System.out.println(employee.getName() + "'s salary is " + employeeManager.calculateSalary(employee) + " kn");
        }

        System.err.println("Zarada od vozila je " + zarada + " kuna");
    }

    private static void checkChargingStatus(Vehicle vehicle) {
        if (vehicle.getEngineChargingPercentage() <= 10){
            if (vehicle.getEngineType() == Engine.electric){
                System.out.println("A vehicle needs battery charging, value is " + vehicle.getEngineChargingPercentage());
            }
            else {
                System.out.println("A vehicle needs gas refill, value is " + vehicle.getEngineChargingPercentage());
            }
        }
        else{
            System.out.println("Vehicle charging percentage is " + vehicle.getEngineChargingPercentage());
        }
    }

    private static void calculateEmployeesProfit(Vehicle vehicle, List<Employee> employees) {
        System.out.println(employees.get(0).getName() + " profit on this ticket is " + employeeManager.calculateProfitByTicket(employees.get(0) ,ticketManager.calculateTicket(vehicle.getVehicleType().toString()), 10) + " kn");
        System.out.println(employees.get(1).getName() + " profit on this ticket is " + employeeManager.calculateProfitByTicket(employees.get(1) ,ticketManager.calculateTicket(vehicle.getVehicleType().toString()), 11) + " kn");
    }

    private static void calculateProfit(Vehicle vehicle) {
        zarada += ticketManager.calculateTicket(vehicle.getVehicleType().toString());
    }
}