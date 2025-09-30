
interface EnglishSpeaker {

    default void sayHello() {
        System.out.println("Hello from EnglishSpeaker");
    }
}

interface FrenchSpeaker {

    default void sayHello() {
        System.out.println("Hello from FrenchSpeaker");
    }
}

class Person implements EnglishSpeaker, FrenchSpeaker {
    // Must override to avoid ambiguity

    @Override
    public void sayHello() {
        System.out.println("Hello, I can speak both English and French");
    }
}

public class DiamondProblemwithInterfaces {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.sayHello();
    }
}
