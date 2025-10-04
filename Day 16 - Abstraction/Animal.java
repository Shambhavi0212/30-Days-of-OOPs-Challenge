
abstract class Animal {

    public abstract void animalSound();

    public void sleep() {
        System.out.println("ZZZZZZ");
    }
}

class Pig extends Animal {

    public void animalSound() {
        System.out.println("wee wee");
    }
}

class Main {

    public static void main(String[] args) {
        Pig obj = new Pig();
        obj.sleep();
        obj.animalSound();
    }
}
