public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        System.out.println("Je suis un chat : " + this); // Output: je suis un chat : Cat@7b23ec81
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat {" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
