package OOP.mypack;

public class Student extends Person implements ISpeak,IStudy{
    public String universityname;
    public Student(String name, int age, float height, String universityname){
        super(name,age,height);
        this.universityname= universityname;
    }
    //Đây là overiding, nếu không muốn lớp con lấy thì để key final ở lớp cha. Ghi đè lại
    public void getInfo() {
        super.getInfo();
        System.out.println("Name: " + this.universityname);
    }

    public Object clone(){
        Student other = new Student(this.name, this.getAge(), this.height, this.universityname);
        return other;
    }

    public void study(){
        System.out.println(this.name + "is studying");
    }

    public void speak(){
        System.out.println(this.name + "is speaking");
    }
    public static void getInfoUniversity(){
        System.out.println("HI ne");
    }

}
