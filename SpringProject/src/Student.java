import java.util.List;

/**
 * Created by DNS on 26.02.2016.
 */
public class Student {
    private String name;
    private Institute institute;
    private List<Lesson> lessons;

    public Student() {
    }

    public Student(String name, Institute institute, List<Lesson> lessons) {
        this.name = name;
        this.institute = institute;
        this.lessons = lessons;
    }

    public String getName() {
        return name;
    }

    public Institute getInstitute() {
        return institute;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInstitute(Institute institute) {
        this.institute = institute;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }
    //comment there
}
