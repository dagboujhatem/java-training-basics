public class Vehicle {
    private boolean started;

    public Vehicle() {
        this.started = false;
    }

    public Vehicle(boolean started) {
        this.started = started;
    }

    public void start() {
        this.started = true;
    }

    public void stop() {
        this.started = false;
    }

    public boolean isStarted() {
        return started;
    }

    @Override
    public String toString() {
        return "Vehicle {" +
                "started=" + started +
                '}';
    }
}
