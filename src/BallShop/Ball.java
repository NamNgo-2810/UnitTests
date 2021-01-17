package BallShop;

import java.util.HashSet;
import java.util.Set;

public abstract class Ball {
    double d;
    double kg;
    int cost;
    String made;
    Set<String> nameSigned; // Danh sách tên các cầu thủ đã ký lên bóng
    double discount; // % giảm giá, cụ thể trong từng loại bóng
    public Ball(double d, double kg, int cost, String made) {
        this.d = d;
        this.kg = kg;
        this.cost = cost;
        this.made = made;
        this.nameSigned = new HashSet<String>();
    }
}
