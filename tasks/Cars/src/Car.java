public class Car {
	CarInfo carInfo = new CarInfo();
	Model model = new Model();
	Engine engine = new Engine();
	Wheel[] wheels = new Wheel[50];
	Sound sound = new Sound();
	Suspension suspension = new Suspension("defaultType", 0.0f, 0.0f, 0.0f);

	public static void main(String arv[]) {
		Car[] cars = new Car[10];
		cars[0] = new Car();
		cars[0].carInfo.setCarInfo(3, 23500, "red", 35000, false, true);
		cars[0].model.setModel("BMW", "M3", 1565, 4345, 1680, 4, 227);
		cars[0].suspension.setSuspension("independent", 12.5f, 450.0f, 150.2f);
		cars[0].engine.setEngine("BMW", "S14B20", 192.0f, 210);
		for (int i = 0; i < cars[0].model.getCountWheel(); i++) {
			cars[0].wheels[i] = new Wheel();
			cars[0].wheels[i].setWheel("Bridgestone", 18, 10, 215, 35, Wheel.WheelType.SUMMER);
		}
	}
}
