# Hierarchical Inheritance

**Definition:**  
Hierarchical inheritance occurs when multiple classes inherit from a single parent class.  
It forms a tree-like structure where one parent class is shared among several child classes.

# One Parent Class -> multiple child classes

---

## **Basic Syntax**
```java
// Parent class
class Parent {
    // Parent class members
}

// Child class 1
class Child1 extends Parent {
    // Child1 members
}

// Child class 2
class Child2 extends Parent {
    // Child2 members
}

// Main class
public class Main {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        // Access parent members using c1 and c2
    }
}
