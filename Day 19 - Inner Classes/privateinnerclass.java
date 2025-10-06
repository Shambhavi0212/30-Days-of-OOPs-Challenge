
class Outerclass {

    int a = 10;

    private class Innerclass {

        int b = 10;
    }
}

public class privateinnerclass {

    public static void main(String[] args) {
        Outerclass o = new Outerclass();
        Outerclass.Innerclass i = o.new Innerclass(); //-- ERROR
        System.out.println(o.a + i.b);
    }
}
