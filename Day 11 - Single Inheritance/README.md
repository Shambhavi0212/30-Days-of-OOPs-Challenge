# 📌 Day 10 : What I Learned Today — Java Single Inheritance (The IS-A Relationship)

## 💡 Concept: Inheritance

**Inheritance** is a fundamental principle of Object-Oriented Programming (OOP) that allows one class to acquire the properties (fields/variables) and behaviors (methods) of another class.

* The class that inherits is called the **Child Class**, **Subclass**, or **Derived Class**.
* The class whose features are inherited is called the **Parent Class**, **Superclass**, or **Base Class**.

## 🤝 Relationship: IS-A

Inheritance establishes an **"IS-A"** relationship between the superclass and the subclass.

* *Example:* A `Dog` **IS-A** `Animal`. A `Car` **IS-A** `Vehicle`.

## 🧑‍💻 Focus: Single Inheritance

**Single Inheritance** is the simplest form of inheritance, where a single subclass inherits from a single superclass.



***

## 🔑 Key Learnings

### 1. `extends` Keyword

The **`extends`** keyword is used in Java to establish the inheritance link, enabling the subclass to inherit features from the superclass.

```java
// Parent Class / Superclass
class Superclass {
    // ... properties and methods
}

// Child Class / Subclass
class Subclass extends Superclass {
    // Subclass now has all non-private members of Superclass
}
