# Day 30 - OOPs Challenge: Animal Example

## Problem Statement (Demonstrating OOP Principles)

### 1. Encapsulation
- Create a base class `Animal` with **private fields**: `name` (String) and `age` (int).  
- Provide **getter and setter methods** to access these fields.

### 2. Polymorphism (Method Overloading)
- In the `Animal` class, implement **two versions** of the method `showInfo()`:
  - `showInfo()` → displays only the name  
  - `showInfo(boolean showAge)` → displays name and age if `showAge` is true

### 3. Abstraction
- Create an **interface** `AnimalActions` with an **abstract method** `makeSound()`.

### 4. Inheritance & Runtime Polymorphism
- Create two subclasses `Dog` and `Cat` that:
  - Extend the `Animal` class (**Inheritance**)  
  - Implement the `AnimalActions` interface  
  - Provide their own implementation of `makeSound()`:
    - Dog → `"Bow Bow"`  
    - Cat → `"Meow Meow"`  

### 5. Main Method Operations
- Create a `Dog` object:
  - Set its name and age  
  - Display info (both name and age)  
  - Call `makeSound()`  
- Create a `Cat` object:
  - Set its name and age  
  - Display info (name only)  
  - Call `makeSound()`

## Objective
- Practice and demonstrate the OOP concepts:  
  **Encapsulation, Inheritance, Polymorphism (compile-time & runtime), and Abstraction**.
