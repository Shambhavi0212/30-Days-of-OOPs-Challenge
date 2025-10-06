
class Outerclass {

    int a = 10;

    class Innerclass {

        public int inmethod() {
            return a;
        }
    }
}

public class outerclass_from_innerclass {

    public static void main(String[] args) {
        Outerclass o = new Outerclass();
        Outerclass.Innerclass i = o.new Innerclass();
        System.out.println(i.inmethod());

    }
}
