public class Model {
	private String brand;

	private String model;

	private int weight;
	private int length;

	private int width;

	private int countWheel;

	private int maxSpeed;

	public void setModel(String brand, String model, int weight, int length, int width, int countWheel, int maxSpeed) {
		this.brand = brand;
		this.model = model;
		this.weight = weight;
		this.length = length;
		this.width = width;
		this.countWheel = countWheel;
		this.maxSpeed = maxSpeed;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getCountWheel() {
		return countWheel;
	}

	public void setCountWheel(int countWheel) {
		this.countWheel = countWheel;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}


}
