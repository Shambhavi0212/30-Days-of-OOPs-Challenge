
class Animal {

    public void sound() {
        System.out.println("The animal makes sounds");
    }
}

class Dog extends Animal {

    public void sound() {
        System.out.println("bow bow");
    }
}

class Cat extends Animal {

    public void sound() {
        System.out.println("meow meow");
    }
}

public class run_time_polymorphism {

    public static void main(String[] args) {
        Animal obj1 = new Animal();
        obj1.sound();
        Animal obj2 = new Cat();
        obj2.sound();
    }
}
