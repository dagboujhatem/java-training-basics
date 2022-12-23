public class Car extends Vehicle {
    private String modelName;

    public Car() {
        super(false);
    }

    public Car(String modelName, boolean started) {
        super(started);
        this.modelName = modelName;
    }

    public Car(String modelName) {
        this.modelName = modelName;
    }

    // redefine the start() method
    @Override
    public void start() {
        super.start();
        System.out.println("The car has been started.");
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "Car {" +
                "modelName='" + modelName + '\'' + ", isStarted=" + super.started +
                '}';
    }

    @Override
    public void accelerate() {
        System.out.println("The bus is accelerating.");
    }
}
