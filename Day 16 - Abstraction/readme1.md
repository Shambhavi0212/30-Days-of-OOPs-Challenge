# Java Abstraction

## What is Abstraction?
- Abstraction is the process of hiding certain details and showing only essential information to the user.  
- It helps to simplify complex systems by exposing only the necessary parts.  
- Abstraction in Java can be achieved in two ways:
  1. Using **Abstract Classes**
  2. Using **Interfaces**

---

## The `abstract` Keyword
- A **non-access modifier** used for classes and methods.  

### Abstract Class
- A restricted class that **cannot be used to create objects**.  
- Must be inherited from another class to be accessed.  

### Abstract Method
- Can only be declared inside an abstract class.  
- It does **not have a body**.  
- The **subclass provides the implementation**.  

---

## Key Points
- An abstract class can contain both **abstract methods** (without body) and **regular methods** (with body).  
- Objects **cannot** be created from an abstract class.  
- To use an abstract class, it must be **inherited by another class**.  
- Subclasses are responsible for providing implementations for the abstract methods.  

---

## Why and When To Use Abstraction?
- To achieve **security** by hiding implementation details.  
- To expose only the **important features** of an object.  
- To design **flexible and maintainable** applications.  

---

## Note
- Abstraction can also be achieved with **Interfaces** (covered in the next chapter).  

---

## Exercise
**Question:** Which of the following best describes abstraction?  
1. Abstraction shows all details to the user.  
2. Abstraction hides implementation details and only exposes essential features.  
3. Abstraction allows direct object creation from abstract classes.  

✅ **Answer:** Option 2  

---

## Syntax of Abstraction

```java
// Abstract class
abstract class Animal {
    // Abstract method (no body)
    public abstract void sound();

    // Regular method (with body)
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass must provide implementation of abstract method
class Dog extends Animal {
    public void sound() {
        System.out.println("Woof Woof");
    }
}

| Feature                  | Abstract Class                              | Interface                                                                                           |
| ------------------------ | ------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| **Methods**              | Can have both abstract and concrete methods | Only abstract methods (until Java 8). From Java 8 onwards, can have `default` and `static` methods. |
| **Access Modifiers**     | Can use any access modifier                 | Methods are `public` by default                                                                     |
| **Attributes**           | Can have instance variables                 | All attributes are `public`, `static`, and `final` by default                                       |
| **Constructors**         | Allowed                                     | Not allowed                                                                                         |
| **Multiple Inheritance** | A class can extend only one abstract class  | A class can implement multiple interfaces                                                           |
| **Purpose**              | Provides partial abstraction and code reuse | Provides full abstraction (rules/contract)                                                          |
