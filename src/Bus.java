public class Bus extends Vehicle {
    public Bus() {
        super(false);
    }

    // redefine the start() method
    @Override
    public void start() {
        super.start();
        System.out.println("The bus has been started.");
    }

    @Override
    public void accelerate() {
        System.out.println("The car is accelerating.");
    }
}
