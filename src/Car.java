public class Car extends Vehicle {
    private String modelName;

    public Car(String modelName, boolean started) {
        super(started);
        this.modelName = modelName;
    }

    public Car(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
