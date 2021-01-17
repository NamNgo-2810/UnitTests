package Restaurant;

public abstract class Food {
    String title;
    int cal;
    int cost;
    int ext;
    public Food(String title, int cal, int cost, int ext) {
        this.title = title;
        this.cal = cal;
        this.cost = cost;
        this.ext = ext;
    }
}
