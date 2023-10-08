package Basic;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name =name;
        this.age=age;
    }

    public void displayInfo(){
        System.out.println("Name: "+ name + ", Age: "+ age);
    }
    public String getName() {
        return name;
    }
}


