public class Main {
    public static void main(String args[]) {
        if (args.length < 7) {
            System.out.println("Недостаточно аргументов для создания объекта класса Model");
            return;
        }
        
        String brand = args[0];
        String modelName = args[1];
        int weight = Integer.parseInt(args[2]);
        int height = Integer.parseInt(args[3]);
        int width = Integer.parseInt(args[4]);
        int length = Integer.parseInt(args[5]);
        int countWheel = Integer.parseInt(args[6]);

        Car[] cars = new Car[10];
        Model model = new Model(brand, modelName, weight, height, width, length, countWheel);
        CarInfo carInfo = new CarInfo(3, 23500, "red", 35000, false, true);
        //Model model = new Model("BMW", "M3", 1565, 4345, 1680, 4, 227);
        Engine engine = new Engine("BMW", "S14B20", 192.0f, 210);
        Wheel[] wheels = new Wheel[model.getCountWheel()];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel("Bridgestone", 18, 10, 215, 35, Wheel.WheelType.SUMMER);
        }
        Sound sound = new Sound();
        Suspension suspension = new Suspension("independent", 12.5f, 450.0f, 150.2f);

        cars[0] = new Car(carInfo, model, engine, wheels, sound, suspension);
        cars[0].model.printInfo();

    }
}
