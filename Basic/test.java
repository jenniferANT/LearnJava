public class test {
    public static void main(String[] args){
        try{
            int[] array = {5, 6, 7};
            System.out.println(array[4]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dont");
        }
    }
}
