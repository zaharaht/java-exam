import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int grade;
    private List<String> courses;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }


    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    //
    public void printCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses registered for " + name);
        } else {
            System.out.println("Courses for " + name + ":");
            for (String course : courses) {
                System.out.println(course);
            }
        }
    }

    public static void main(String[] args) {

        Student student1 = new Student("zearah",10);

        student1.addCourse("data communication");
        student1.addCourse("java");
        student1.addCourse("sad");


        student1.printCourses();


        student1.removeCourse("Java");

        student1.printCourses();
    }
}

