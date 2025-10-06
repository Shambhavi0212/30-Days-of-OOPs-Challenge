# 🧠 Compile-time Polymorphism in Java

## 📘 Definition
**Compile-time Polymorphism** is a type of polymorphism that is achieved at **Java's compile time**.

---

## ✅ Key Points
- Decision of which method to call is made by the **compiler**.  
- Methods must have the **same name** but **different parameters**.  
- It is also called **static polymorphism** because the method call is **determined at compile time**, not at runtime.  
- It is achieved using **method overloading** — same method name with **different parameters**.

---

## 🔹 Example
```java
class MathOperation {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperation obj = new MathOperation();
        
        System.out.println(obj.add(5, 10));      // calls int version
        System.out.println(obj.add(5.5, 2.5));   // calls double version
    }
}
