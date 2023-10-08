package Basic;

public class Client {
    public static void main(String[] args) {
        // Tạo các đối tượng
        Student student = new Student("Alice", 20, "S123", 3.8);
        Intern intern = new Intern("Bob", 22, "I456", 160);
        Lecturer lecturer = new Lecturer("Carol", 35, "L789", 5000);
        Employee employee = new Employee("David", 28, "E012", 4000);

        // In thông tin và tính lương, điểm của mỗi đối tượng
        student.displayInfo();
        System.out.println("Salary: $" + student.calculateSalary());
        System.out.println(student.calculateGrade());

        intern.displayInfo();
        System.out.println("Salary: $" + intern.calculateSalary());
        System.out.println(intern.calculateGrade());

        lecturer.displayInfo();
        System.out.println("Salary: $" + lecturer.calculateSalary());
        System.out.println(lecturer.calculateGrade());

        employee.displayInfo();
        System.out.println("Salary: $" + employee.calculateSalary());
        System.out.println(employee.calculateGrade());
    }
}
