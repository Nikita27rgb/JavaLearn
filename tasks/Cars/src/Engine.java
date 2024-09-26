public class Engine {
	private String brand;
	private String modelEngine;
	private int horsePower;
	private int torque;

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

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
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
