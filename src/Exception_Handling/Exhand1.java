package Exception_Handling;

public class Exhand1 {
    public static void main(String[] args) {
        try{
            int number = 10/0;
        }
        catch (Exception e){
            System.out.println("Enter a valid number.....");
        }
    }
}
