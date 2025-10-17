
public class throww {

    public static void main(String[] args) {
        int age = 16;
        if (age < 18) {
            throw new ArithmeticException("Access denied");
        } else {
            System.out.println("You are eligible to vote!!");
        }
    }
}
