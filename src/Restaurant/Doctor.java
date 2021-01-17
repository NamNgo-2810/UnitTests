package Restaurant;

public class Doctor {
    String name;
    int yrs;
    int money; //  Số tiền cần trả bác sĩ
    public Doctor(String name, int yrs, int money) {
        this.name = name;
        this.yrs = yrs;
        this.money = money;
    }
    public int offer(Food b) {
        if (b instanceof DFood) return -1;
        return (int)(money*0.1);
    }
}
