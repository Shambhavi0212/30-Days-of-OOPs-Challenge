
class Animal {

    public void sound() {
        System.out.println("The animal makes sounds!");
    }
}

class Dog extends Animal {

    public void sound() {
        super.sound();
        System.out.println("Bow Bow");
    }
}

public class Accessing_method {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
