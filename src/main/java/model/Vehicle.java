package model;

public class Vehicle {
    private Engine engineType;
    private int EngineChargingPercentage;

    private VehicleType vehicleType;

    public Vehicle(Engine engineType, int engineChargingPercentage, VehicleType vehicleType) {
        this.engineType = engineType;
        EngineChargingPercentage = engineChargingPercentage;
        this.vehicleType = vehicleType;
    }

    public Engine getEngineType() {
        return engineType;
    }

    public void setEngineType(Engine engineType) {
        this.engineType = engineType;
    }

    public int getEngineChargingPercentage() {
        return EngineChargingPercentage;
    }

    public void setEngineChargingPercentage(int engineChargingPercentage) {
        EngineChargingPercentage = engineChargingPercentage;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
