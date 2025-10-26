# Day 30 - OOPs Challenge: Animal Example

## What We Have Done

In this challenge, we implemented a **Java program** that demonstrates key **OOP principles** using a practical example of animals (Dog and Cat). The following steps were taken:

### 1. Encapsulation
- Created a base class `Animal` with **private fields**: `name` and `age`.
- Added **getter and setter methods** to control access to these fields.
- This ensures that the internal state of the object cannot be modified directly from outside the class.

### 2. Polymorphism
- Implemented **method overloading** in `Animal` class:
  - `showInfo()` → displays only the name  
  - `showInfo(boolean showAge)` → displays both name and age if `showAge` is true
- Demonstrated **runtime polymorphism** by implementing the `AnimalActions` interface in `Dog` and `Cat` classes, where each class provides its own implementation of `makeSound()`.

### 3. Abstraction
- Created an **interface `AnimalActions`** with an abstract method `makeSound()`.
- The interface hides the implementation details, allowing different animals to define their own sounds.

### 4. Inheritance
- `Dog` and `Cat` classes **extend `Animal`**, inheriting its properties and methods.
- This avoids code duplication and promotes reusability.

### 5. Main Method Operations
- Created objects of `Dog` and `Cat`.
- Set their names and ages using setter methods.
- Displayed their information using overloaded methods.
- Called the `makeSound()` method to demonstrate interface implementation.

## Key Learning Outcomes
- How to **encapsulate data** using private fields and getter/setter methods.
- How to implement **method overloading** for compile-time polymorphism.
- How to use **interfaces** for abstraction and runtime polymorphism.
- How **inheritance** allows reuse of common properties and methods.
- How **OOP principles** can be applied in a practical, real-world-like scenario.

## Sample Output
