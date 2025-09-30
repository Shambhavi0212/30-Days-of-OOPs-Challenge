# Multilevel Inheritance in Java

## Definition
Multilevel inheritance occurs when a class inherits from a subclass, creating a chain of inheritance. In other words:

**Grandparent class → Parent class → Child class**

The child class indirectly inherits from the grandparent class through the parent class.

## Syntax Example in Java

```java
class A { 
    // Grandparent class
}

class B extends A { 
    // Parent class
}

class C extends B { 
    // Child class
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        // obj can access members of C, B, and A
    }
}
