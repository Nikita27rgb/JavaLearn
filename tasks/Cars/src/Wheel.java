public class Wheel {
	private String brand;
	private int radius;
	private int weight;

	private int width;

	private int height;

	public enum WheelType {
		SUMMER,
		WINTER,
		ALLSEASON,
	}

	private WheelType wheelType;

	public String getBrand() {
		return brand;
	}

	public int getRadius() {
		return radius;
	}

	public int getWidth() {
		return width;
	}

	public int getWeight() {
		return weight;
	}

	public int getHeight() {
		return height;
	}

	public WheelType getWheelType() {
		return wheelType;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWheelType(WheelType wheelType) {
		this.wheelType = wheelType;
	}

	public void wheelInfo(){}
}
