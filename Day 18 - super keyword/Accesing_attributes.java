
class Math {

    int a = 10;
}

class varr extends Math {

    int a = 100;

    public void display() {
        System.out.println(super.a);
        System.out.println(a);
    }
}

public class Accesing_attributes {

    public static void main(String[] args) {
        varr obj1 = new varr();
        obj1.display();
    }
}
