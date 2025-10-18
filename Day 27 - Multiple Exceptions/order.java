
public class order {

    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println("General error!");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
    //throws error
    //Always catch specific exceptions first, then general ones — otherwise, the compiler will stop you with an unreachable catch block error.
}
