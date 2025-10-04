# Interfaces in Java

## What is an Interface?
- An **interface** is another way to achieve abstraction in Java.  
- It is like a completely **abstract class** that is used to group related methods with empty bodies.  
- An interface defines a **set of rules/contract** that classes must follow.

---

## Key Points About Interfaces
- Interfaces **cannot be used to create objects**.  
- Interface methods **do not have a body** – the body is provided by the class that implements the interface.  
- When a class implements an interface, it **must override all of its methods**.  
- Interface methods are **by default `public` and `abstract`**.  
- Interface attributes are **by default `public`, `static`, and `final`**.  
- Interfaces **cannot have constructors** (since they cannot be used to create objects).  

---

## Accessing Interface Methods
- To access the methods of an interface, a class must **implement** the interface using the `implements` keyword.  
- The **implementing class** provides the body of the interface methods.  
- Then, you can create an **object of the implementing class** and call the interface methods through that object.

---

## Why and When to Use Interfaces?
1. **To achieve security** – hide certain details and only show the important features of an object.  
2. **To support multiple inheritance** – Java does not allow a class to inherit from more than one class, but it allows a class to implement multiple interfaces.  

---

## Multiple Interfaces
- A class can implement multiple interfaces by separating them with a comma.  
- This helps in achieving **multiple inheritance** in Java.  

---

## Exercise
**Question:** Which keyword is used to implement an interface?  
- public  
- extends  
- implements ✅  
- abstract  

---

## Syntax of an Interface
```java
// Defining an interface
interface InterfaceName {
    returnType method1();
    returnType method2();
    // more methods...
}

// Implementing the interface
class ClassName implements InterfaceName {
    public returnType method1() {
        // method body
    }

    public returnType method2() {
        // method body
    }
}
