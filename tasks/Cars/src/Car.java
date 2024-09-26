public class Car {
	CarInfo carInfo = new CarInfo();
	Model model = new Model();
	Engine engine = new Engine();
	Wheel[] wheels = new Wheel[model.getCountWheel()];
	Sound sound = new Sound();
	Suspension suspension = new Suspension();
}
