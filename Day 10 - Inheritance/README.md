# Java Inheritance (Subclass and Superclass)

In Java, it is possible to inherit attributes and methods from one class to another. We group the **inheritance concept** into two categories:

- **Subclass (child)** - the class that inherits from another class  
- **Superclass (parent)** - the class being inherited from  

To inherit from a class, use the `extends` keyword.

---

## Example


# Java Inheritance Concepts

## Access Modifiers

Notice the `protected` modifier in `Vehicle`:

- The `brand` attribute in `Vehicle` is set to `protected`, which allows the `Car` class to access it.
- If it were set to `private`, the `Car` class would **not** be able to access it.

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
