package BallShop;

public class Player extends Customer {
    int pop;
    public Player(String name, int id, boolean isM, int age, int pop) {
        super(name, id, isM, age);
        this.pop = pop;
    }
    public int buy(Ball b) {
        if (b.nameSigned.size() > 1) return b.cost*10; // Có cầu thủ khác ký tên lên
        return (int)(b.cost*b.discount);
    }
}
