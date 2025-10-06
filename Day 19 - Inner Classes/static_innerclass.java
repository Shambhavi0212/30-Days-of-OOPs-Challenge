
class Outerclass {

    int a = 10;

    static class Innerclass {

        int b = 10;
    }
}

public class static_innerclass {

    public static void main(String[] args) {
        Outerclass.Innerclass i = new Outerclass.Innerclass();
        System.out.println(i.b);
    }
}
