package Council;

import java.util.ArrayList;
import java.util.List;

public class Council {
    List<Student> students;
    List<Lecturer> lecturers;
    List<Visitor> visitors;
    public Council() {
        this.students = new ArrayList<Student>();
        this.lecturers = new ArrayList<Lecturer>();
        this.visitors = new ArrayList<Visitor>();
    }
    public boolean add(Student s) {
        if (students.size() >= 3) return false;
        for (Course course: s.courseList) {
            for (Lecturer lecturer: this.lecturers) {
                if (course.lecturer == lecturer) return false;
            }
        }
        if ((students.size() + lecturers.size() + visitors.size()) % 2 == 1) return false;
        students.add(s);
        return true;
    }
}
