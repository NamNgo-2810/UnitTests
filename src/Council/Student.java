package Council;

import java.util.ArrayList;
import java.util.List;

public class Student extends Member {
    String sid;
    List<Course> courseList;
    public Student(String name, int age, String id, String sid) {
        super(name, age, id);
        this.sid = sid;
        this.courseList = new ArrayList<Course>();
    }
}
