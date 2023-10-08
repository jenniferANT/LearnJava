package Basic;

class Employee extends Person {
    private String employeeId;
    private double monthlySalary;

    public Employee(String name, int age, String employeeId, double monthlySalary) {
        super(name, age);
        this.employeeId = employeeId;
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary() {
        return monthlySalary;
    }

    public String calculateGrade() {
        return "Employee " + getName() + "'s Performance: Satisfactory";
    }
}

