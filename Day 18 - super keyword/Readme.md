# Java super

## Java super Keyword

In Java, the super keyword is used to refer to the parent class of a subclass.

The most common use of the super keyword is to eliminate the confusion between superclasses and subclasses that have methods with the same name.

It can be used in two main ways:

- To access attributes and methods from the parent class
- To call the parent class constructor

### Access Parent Methods

If a subclass has a method with the same name as one in its parent class, you can use super to call the parent version:

**Example:**

class Animal {  
  public void animalSound() {  
    System.out.println("The animal makes a sound");  
  }  
}  

class Dog extends Animal {  
  public void animalSound() {  
    super.animalSound(); // Call the parent method  
    System.out.println("The dog says: bow wow");  
  }  
}  

public class Main {  
  public static void main(String[] args) {  
    Dog myDog = new Dog();  
    myDog.animalSound();  
  }  
}  

**Output:**  

The animal makes a sound  
The dog says: bow wow  

**Note:** Use super when you want to call a method from the parent class that has been overridden in the child class.

### Access Parent Attributes

You can also use super to access an attribute from the parent class if they have an attribute with the same name:

**Example:**

class Animal {  
  String type = "Animal";  
}  

class Dog extends Animal {  
  String type = "Dog";  

  public void printType() {  
    System.out.println(super.type); // Access parent attribute  
  }  
}  

public class Main {  
  public static void main(String[] args) {  
    Dog myDog = new Dog();  
    myDog.printType();  
  }  
}  

**Output:**  

Animal

### Call Parent Constructor

Use super() to call the constructor of the parent class. This is especially useful for reusing initialization code.

**Example:**

class Animal {  
  Animal() {  
    System.out.println("Animal is created");  
  }  
}  

class Dog extends Animal {  
  Dog() {  
    super(); // Call parent constructor  
    System.out.println("Dog is created");  
  }  
}  

public class Main {  
  public static void main(String[] args) {  
    Dog myDog = new Dog();  
  }  
}  

**Output:**  

Animal is created  
Dog is created  

**Note:** The call to super() must be the first statement in the subclass constructor.

---

## Syntax Summary

- `super.sound()` → call parent method  
- `super.a` → access parent attribute  
- `super()` → call parent constructor
