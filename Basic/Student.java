package Basic;

public class Student extends Person{
    private String studentId;
    private double gpa;

    public Student(String name,int age, String studentId, double gpa){
        super(name, age);
        this.studentId= studentId;
        this.gpa= gpa;
    }
    public double calculateSalary(){
        return 0 ;
    }

    public String calculateGrade(){
        return "Student" + getName() +"'s GPA:" + gpa;
    }
}
