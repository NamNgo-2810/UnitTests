package Restaurant;

public class DFood extends Food {
    Doctor doctor;
    public DFood(String title, int cal, int cost, int ext, Doctor doctor) {
        super(title, cal, cost, ext);
        this.doctor = doctor;
    }
}
