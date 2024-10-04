package web.models;

public class Car {
    private String CarModel;
    private int region;
    private String model;

    public Car(String carModel, int region, String model) {
        CarModel = carModel;
        this.region = region;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRegion() {
        return region;
    }

    public void setRegion(int region) {
        this.region = region;
    }

    public String getCarModel() {
        return CarModel;
    }

    public void setCarModel(String carModel) {
        CarModel = carModel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "CarModel='" + CarModel + '\'' +
                ", region=" + region +
                ", model='" + model + '\'' +
                '}';
    }
}

