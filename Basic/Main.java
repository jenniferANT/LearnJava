package Basic;

public class Main {
    static void checkAge(int age){
        if(age < 18){
            System.out.println("Acces");
        }
        else{
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        checkAge(20);
    }
}
