# Java Inheritance

In Java, it is possible to inherit attributes and methods from one class to another. We group the **inheritance concept** into two categories:

- **Subclass (child)** - the class that inherits from another class  
- **Superclass (parent)** - the class being inherited from  

To inherit from a class, use the `extends` keyword.

## Example

The `Car` class (subclass) inherits the attributes and methods from the `Vehicle` class (superclass):

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
# Notes on Java Inheritance

#Access Modifiers

- The `brand` attribute in `Vehicle` is `protected`.  
- If it were `private`, the `Car` class would **not** be able to access it.

# Why and When to Use Inheritance

- **Code Reusability**: Reuse attributes and methods of an existing class when creating a new class.  
- Helps organize classes in a hierarchical manner.  
- Works together with **Polymorphism** for performing different tasks using inherited methods.

#The `final` Keyword

##- If you don’t want other classes to inherit from a class, use the `final` keyword:

```java
final class Vehicle {
  ...
}

class Car extends Vehicle {
  ...
}
#If you try to inherit from a final class, Java will generate an error:
-Main.java:9: error: cannot inherit from final Vehicle
-class Main extends Vehicle {
                  ^
-1 error
-vbnet
# Types of Inheritance in Java

1. **Single Inheritance**  
   - A subclass inherits from **one** superclass.  
   - Example: `class Car extends Vehicle { ... }`

2. **Multilevel Inheritance**  
   - A chain of inheritance where a subclass acts as a superclass for another subclass.  
   - Example: `class Vehicle → class Car → class SportsCar`

3. **Hierarchical Inheritance**  
   - Multiple subclasses inherit from **one** superclass.  
   - Example: `class Vehicle → class Car`, `class Vehicle → class Truck`

4. **Multiple Inheritance (via Interfaces)**  
   - A class implements **multiple interfaces** to achieve multiple inheritance.  
   - Example: `class Car implements Interface1, Interface2 { ... }`

5. **Hybrid Inheritance**  
   - A combination of **two or more types** of inheritance.  
   - Achieved using classes and interfaces to avoid ambiguity.

