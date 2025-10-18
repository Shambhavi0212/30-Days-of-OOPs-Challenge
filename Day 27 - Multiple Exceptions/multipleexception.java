
public class multipleexception {

    public static void main(String[] args) {
        try {
            int nums[] = {1, 2, 3};
            System.out.println(nums[9]);
            int a = 10 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There is no index to access!!");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } catch (Exception e) {
            System.out.println("General error!");
        }
    }
}
