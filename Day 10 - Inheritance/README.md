# Java Inheritance (Subclass and Superclass)

In Java, it is possible to inherit attributes and methods from one class to another. We group the **inheritance concept** into two categories:

- **Subclass (child)** - the class that inherits from another class  
- **Superclass (parent)** - the class being inherited from  

To inherit from a class, use the `extends` keyword.

---

## Example

In the example below, the `Car` class (subclass) inherits the attributes and methods from the `Vehicle` class (superclass):

```java
class Vehicle {
  protected String brand = "Ford";        // Vehicle attribute

  public void honk() {                    // Vehicle method
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustang";    // Car attribute

  public static void main(String[] args) {
    // Create a myCar object
    Car myCar = new Car();

    // Call the honk() method (from the Vehicle class) on the myCar object
    myCar.honk();

    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
    System.out.println(myCar.brand + " " + myCar.modelName);
  }
}
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
