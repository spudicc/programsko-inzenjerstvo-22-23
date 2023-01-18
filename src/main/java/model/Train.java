package model;

public class Train {
    private TrainType trainType;

    public Train(TrainType trainType) {
        this.trainType = trainType;
    }

    public TrainType getTrainType() {
        return trainType;
    }

    public void setTrainType(TrainType trainType) {
        this.trainType = trainType;
    }
}
