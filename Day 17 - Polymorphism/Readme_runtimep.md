# 🧠 Runtime Polymorphism in Java

## 📘 Definition
**Runtime Polymorphism** is a type of polymorphism that is achieved at **Java's runtime**.

---

## ✅ Key Points
- The decision of which method to call is made by the **JVM at runtime**, not by the compiler.  
- It is also called **dynamic polymorphism** because the method call is **determined dynamically** based on the actual object.  
- It is achieved through **method overriding** — same method name, same parameters, but in **parent–child classes**.  
- It works only with **inheritance** and **non-static methods**.  
- It allows one reference (parent) to behave differently based on the **object** it refers to.

---

## 🔹 Example
```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal obj = new Dog();  // parent reference, child object
        obj.sound();             // JVM decides at runtime which method to run
    }
}
