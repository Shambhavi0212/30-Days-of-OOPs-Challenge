
class Animal {

    void eat() {
        System.out.println("It can eat");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    void meow() {
        System.out.println("Cat meows");
    }
}

public class Main {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
