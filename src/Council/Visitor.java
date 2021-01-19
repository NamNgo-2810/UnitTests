package Council;

public class Visitor extends Member {
    String vid;

    public Visitor(String name, int age, String id, String vid) {
        super(name, age, id);
        this.vid = vid;
    }
}
