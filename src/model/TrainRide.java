package model;

public class TrainRide {
    public Train train;
    public int numberOfSpaces;
    public int carTicket;
    public int truckTicket;

    public TrainRide(Train train, int numberOfSpaces, int carTicket, int truckTicket) {
        this.train = train;
        this.numberOfSpaces = numberOfSpaces;
        this.carTicket = carTicket;
        this.truckTicket = truckTicket;
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

    public int getCarTicket() {
        return carTicket;
    }

    public void setCarTicket(int carTicket) {
        this.carTicket = carTicket;
    }

    public int getTruckTicket() {
        return truckTicket;
    }

    public void setTruckTicket(int truckTicket) {
        this.truckTicket = truckTicket;
    }
}
