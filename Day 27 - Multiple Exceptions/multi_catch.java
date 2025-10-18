
public class multi_catch {

    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            int nums[] = {1, 2, 3};
            System.out.println(nums[5]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Math error or any array index accesing related error!");
        }
    }
}
