# Java Inheritance (Subclass and Superclass)

In Java, it is possible to inherit attributes and methods from one class to another. We group the **inheritance concept** into two categories:

- **Subclass (child)** - the class that inherits from another class  
- **Superclass (parent)** - the class being inherited from  

To inherit from a class, use the `extends` keyword.

---


# Java Inheritance Concepts
## Types of Inheritance in Java

Inheritance in Java can be classified into several types based on how classes are related:

1. **Single Inheritance**  
   - A subclass inherits from **one** superclass.  
   - Example: `Car` inherits from `Vehicle`.

2. **Multilevel Inheritance**  
   - A chain of inheritance where a class inherits from a subclass, which in turn inherits from another superclass.  
   - Example: `SportsCar` → `Car` → `Vehicle`.

3. **Hierarchical Inheritance**  
   - Multiple subclasses inherit from a **single superclass**.  
   - Example: `Car` and `Bike` both inherit from `Vehicle`.

4. **Multiple Inheritance (through interfaces)**  
   - A class can implement **multiple interfaces** to achieve multiple inheritance.  
   - Note: Java **does not support multiple inheritance with classes** to avoid ambiguity.  
   - Example: `class FlyingCar implements Vehicle, FlyingMachine`.

5. **Hybrid Inheritance**  
   - A combination of two or more types of inheritance (usually single + multiple via interfaces).  
   - Example: `SportsCar` inherits from `Car` and implements `Racing` interface.


## Why and When to Use Inheritance?

- **Code Reusability**: Reuse attributes and methods of an existing class when creating a new class.  
- **Hierarchical Relationships**: Helps maintain a clear parent-child relationship between classes.  
- **Polymorphism**: Often used in combination with polymorphism, which allows inherited methods to perform different tasks.

## The `final` Keyword

- If you don't want other classes to inherit from a class, use the `final` keyword:

```java
final class Vehicle {
  // class content
}

class Car extends Vehicle {
  // This will cause an error
}
