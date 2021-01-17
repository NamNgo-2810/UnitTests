package BallShop;

public class FoBall extends Ball {
    public FoBall(double d, double kg, int cost, String made) {
        super(d, kg, cost, made);
        this.discount = 0.5;
    }
}
