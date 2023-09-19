

import OOP.mypack.Person;
import OOP.mypack.Student;

public class helloWorld {
    static String course;
    static {
        System.out.println("UTH");
        course = "Java core";
    }

    public static void main(String[] args) {

        System.out.println("course: "+ helloWorld.course);

        Student a = new Student("Chau ",21,1.7f, "UTH");
        a.getInfo();
        Student.getInfoUniversity();
    }
}
