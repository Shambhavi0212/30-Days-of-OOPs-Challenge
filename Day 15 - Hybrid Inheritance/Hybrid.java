// Interface A

interface A {

    void methodA();
}

// Interface B
interface B {

    void methodB();
}

// Class C implements multiple interfaces (Multiple Inheritance)
class C implements A, B {

    public void methodA() {
        System.out.println("Method A from Interface A");
    }

    public void methodB() {
        System.out.println("Method B from Interface B");
    }
}

// Class D extends C (Single Inheritance)
class D extends C {

    void methodD() {
        System.out.println("Method D from Class D");
    }
}

// Main class
public class Hybrid {

    public static void main(String[] args) {
        D obj = new D();
        obj.methodA(); // From Interface A via C
        obj.methodB(); // From Interface B via C
        obj.methodD(); // From Class D
    }
}
