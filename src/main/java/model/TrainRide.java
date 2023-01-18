package model;

import java.util.List;

public class TrainRide {
    private Train train;
    private int numberOfSpaces;
    private List<Vehicle> vehicles;

    public TrainRide(Train train, int numberOfSpaces, List<Vehicle> vehicles) {
        this.train = train;
        this.numberOfSpaces = numberOfSpaces;
        this.vehicles = vehicles;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public int getNumberOfSpaces() {
        return numberOfSpaces;
    }

    public void setNumberOfSpaces(int numberOfSpaces) {
        this.numberOfSpaces = numberOfSpaces;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
