
public class Car {
	String brand;
	String model;
	String color;
	Short maxSpeed;
	Short yearOfRelease;
	int price;
	static int countBuyCar = 0;
	static int countAllCar = 0;
	static int totalSales = 0;

	Car(String brand, String model, String color, Short maxSpeed, Short yearOfRelease, int price) {
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.yearOfRelease = yearOfRelease;
		this.price = price;
		countAllCar++;
	}

	protected int buyCar(int capital) {
		capital -= this.price;
		countBuyCar++;
		return capital;
	}

	protected int saleCar(int capital) {
		capital += this.price;
		totalSales += this.price;
		return capital;
	}

	protected int repairCar(int capital, int cost, int newPrice) {
		this.price = newPrice;
		capital -= cost;
		return capital;
	}

	protected String info() {
		return "Car:\n\t" + this.brand + "\n\tmodel: " + this.model + "\n\tColor: "
				+ this.color + "\n\tMax speed: " + this.maxSpeed + "\n\tYear: " + this.yearOfRelease + "\n\tPrice: "
				+ this.price;
	}

	protected void printInfo() {
		System.out.println(info());
	}

	public static void main(String[] argv) {
		int capital = 30000;
		System.out.println("Мой капитал до покупки 1ой машины: " + capital + '\n');
		Car bmw = new Car("BMW", "X1", "White", (short) 250, (short) 2013, 23000);
		capital = bmw.buyCar(capital);
		capital = bmw.repairCar(capital, 2000, 35000);
		capital = bmw.saleCar(capital);
		bmw.printInfo();
		System.out.println("\nМой капитал после покупки 1ой машины, ее ремонта и продажи: " + capital);
	}

}


