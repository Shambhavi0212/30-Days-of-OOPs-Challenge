
class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Main {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(2, 1));
        System.out.println(c.add(1, 2, 3));
    }
}
