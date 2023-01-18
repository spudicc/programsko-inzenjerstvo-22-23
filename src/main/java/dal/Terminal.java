package dal;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class Terminal {
    List<TrainRide> trainRides;
    List<Employee> employees;

    public Terminal() {
        trainRides = new ArrayList<>();
        employees = new ArrayList<>();
        List<Vehicle> smallvehicles = new ArrayList<>();
        smallvehicles.add(new Vehicle(Engine.electric, 10, VehicleType.car));
        smallvehicles.add(new Vehicle(Engine.gas, 10, VehicleType.car));
        smallvehicles.add(new Vehicle(Engine.gas, 20, VehicleType.van));
        List<Vehicle> bigvehicles = new ArrayList<>();
        bigvehicles.add(new Vehicle(Engine.electric, 100, VehicleType.bus));
        bigvehicles.add(new Vehicle(Engine.gas, 90, VehicleType.truck));
        bigvehicles.add(new Vehicle(Engine.gas, 80, VehicleType.truck));
        bigvehicles.add(new Vehicle(Engine.gas, 50, VehicleType.truck));
        trainRides.add(new TrainRide(new Train(TrainType.small), 8, smallvehicles));
        trainRides.add(new TrainRide(new Train(TrainType.large), 6, bigvehicles));

        employees.add(new Employee("Miroslav"));
        employees.add(new Employee("Marko"));
    }

    public List<TrainRide> getTrainRides() {
        return trainRides;
    }

    public void setTrainRides(List<TrainRide> trainRides) {
        this.trainRides = trainRides;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

}
