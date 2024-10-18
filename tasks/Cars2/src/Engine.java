public class Engine {
    private String brand;
    private String modelEngine;
    private double horsePower;
    private int torque;

    Engine(String brand, String modelEngine, double horsePower, int torque) {
        this.brand = brand;
        this.modelEngine = modelEngine;
        this.horsePower = horsePower;
        this.torque = torque;
    }

    @Override
    public String toString() {
        return new StringBuilder(getClass().getName()).append(" [" + brand + ", model: " + modelEngine + ", horse power: " + horsePower + ", torque: " + torque + "]").toString();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelEngine() {
        return modelEngine;
    }

    public void setModelEngine(String modelEngine) {
        this.modelEngine = modelEngine;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public enum FuelType {
        DIESEL,
        GASOLINE
    }

    private FuelType fuelType;

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public FuelType getFuelType() {
        return this.fuelType;
    }

    public void engineInfo() {
    }
}
