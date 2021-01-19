package Council;

public class Paper {
    Member[] authors;
    public boolean join(Council cn) {
        for (Member member: authors) {
            for (Student student: cn.students) {
                if (student == member) return false;
            }
            for (Lecturer lecturer: cn.lecturers) {
                if (lecturer == member) return false;
            }
            for (Visitor visitor: cn.visitors) {
                if (visitor == member) return false;
            }
        }
        return true;
    }
}
