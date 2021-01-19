package Council;

public class Lecturer extends Member {
    String lid;
    public Lecturer(String name, int age, String id, String lid) {
        super(name, age, id);
        this.lid = lid;
    }
}
