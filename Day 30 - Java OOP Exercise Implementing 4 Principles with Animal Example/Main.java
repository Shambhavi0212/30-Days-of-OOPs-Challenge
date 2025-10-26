/*
Problem Statement (Demonstrating OOP Principles):

1. Encapsulation:
   - Create a base class `Animal` with private fields `name` (String) and `age` (int).
   - Provide getter and setter methods to access these fields.

2. Polymorphism (Method Overloading):
   - In the `Animal` class, implement two versions of the method `showInfo()`:
       a) showInfo() → displays only the name
       b) showInfo(boolean showAge) → displays name and age if showAge is true

3. Abstraction:
   - Create an interface `AnimalActions` with an abstract method `makeSound()`.

4. Inheritance & Runtime Polymorphism:
   - Create two subclasses `Dog` and `Cat` that:
       - Extend the `Animal` class (Inheritance)
       - Implement the `AnimalActions` interface
       - Provide their own implementation of `makeSound()`:
           - Dog → "Bow Bow"
           - Cat → "Meow Meow"

5. Main Method Operations:
   - Create a `Dog` object, set its name and age, display info (both name and age), and call `makeSound()`.
   - Create a `Cat` object, set its name and age, display info (name only), and call `makeSound()`.

Objective:
- Practice and demonstrate the OOP concepts of Encapsulation, Inheritance, Polymorphism (compile-time and runtime), and Abstraction.
 */

class Animal {

    private String name;
    private int age;

    public void set(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void showInfo() {
        System.out.println("Name : " + name);
    }

    public void showInfo(boolean showAge) {
        if (showAge) {
            System.out.println("Name : " + name + ", Age :" + age);
        } else {
            showInfo();
        }
    }

}

interface AnimalActions {

    void makeSound();
}

class Dog extends Animal implements AnimalActions {

    public void makeSound() {
        System.out.println(getName() + " says : Bow Bow");
    }
}

class Cat extends Animal implements AnimalActions {

    public void makeSound() {
        System.out.println(getName() + " says : Meow Meow");
    }
}

public class Main {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.set("Pinky", 5);
        d.showInfo(true);
        d.makeSound();

        Cat c = new Cat();
        c.set("Kargu", 2);
        c.showInfo(false);
        c.makeSound();
    }
}
