package Basic;

public class Intern extends Person{
    private String internId;
    private int hoursWorked;

    public Intern(String name, int age, String internId, int hoursWorked){
        super(name, age);
        this.internId = internId;
        this.hoursWorked=hoursWorked;

    }
    public double calculateSalary(){
        return hoursWorked *10;
    }
    public String calculateGrade(){
        return "Intern "+ getName() + "'s Performance: Excellent";
    }
}
