
public class exception {

    public static void main(String[] args) {
        try {
            int num[] = {1, 2, 3};
            System.out.println(num[5]);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("End of the program");
        }
    }
}
