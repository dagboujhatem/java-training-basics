public class Emp {
    String name;

    public Emp() {
    }

    public Emp(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                '}';
    }
}
