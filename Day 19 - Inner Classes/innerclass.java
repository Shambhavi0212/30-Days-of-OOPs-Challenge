
class OuterClass {

    int a = 10;

    class InnerClass {

        int b = 100;
    }
}

public class innerclass {

    public static void main(String[] args) {
        OuterClass o = new OuterClass();
        OuterClass.InnerClass i = o.new InnerClass();
        System.out.println(o.a + i.b);
    }
}
