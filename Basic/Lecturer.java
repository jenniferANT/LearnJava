package Basic;

class Lecturer extends Person {
    private String employeeId;
    private double monthlySalary;

    public Lecturer(String name, int age, String employeeId, double monthlySalary) {
        super(name, age);
        this.employeeId = employeeId;
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary() {
        return monthlySalary;
    }

    public String calculateGrade() {
        return "Lecturer " + getName() + "'s Teaching Performance: Outstanding";
    }
}

