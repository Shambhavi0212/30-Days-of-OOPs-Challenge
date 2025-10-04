
interface Animall {

    public abstract void eat();
}

class Dog implements Animall {

    public void sleep() {
        System.out.println("It can sleep");

    }

    public void eat() {
        System.out.println("It can eat");
    }
}

class Mainn {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sleep();
        d.eat();
    }
}
