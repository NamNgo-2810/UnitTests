package BallShop;

public abstract class Customer {
    String name;
    int id;
    boolean isM;
    int age;
    public Customer(String name, int id, boolean isM, int age) {
        this.name = name;
        this.id = id;
        this.isM = isM;
        this.age = age;
    }
}
