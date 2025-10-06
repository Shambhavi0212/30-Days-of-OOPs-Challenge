
class Animal {

    Animal() {
        System.out.println("Animal makes sounds");
    }
}

class Dog extends Animal {

    Dog() {
        super();
        System.out.println("bow bow");
    }
}

public class Calling_constructor {

    public static void main(String[] args) {
        Dog d = new Dog();
    }

}
