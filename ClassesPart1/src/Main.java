public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("h");
        car.setModel("Carrera");
        car.setColor("Red");
        System.out.println("Make = " + car.getMake());
        System.out.println("Model = " + car.getModel());
        System.out.println("Color = " + car.getColor());
        car.describeCar();
    }
}
