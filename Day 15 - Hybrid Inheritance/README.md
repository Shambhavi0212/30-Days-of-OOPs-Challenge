# Hybrid Inheritance in Java

**Definition:**  
Hybrid inheritance is a combination of two or more types of inheritance in Java. Since Java does **not support multiple inheritance with classes**, hybrid inheritance is achieved using **interfaces** along with classes.

---

## Key Points

* It **combines single, multiple, and hierarchical inheritance** in a single program.  
* Helps in reusing code from multiple sources.  
* Implemented in Java using **classes and interfaces**.

---

## Example (Conceptual)

- Interface A
- Interface B
- Class C implements A, B
- Class D extends C


* `C` inherits from multiple interfaces (`A` and `B`) → **Multiple inheritance (interfaces)**  
* `D` inherits from `C` → **Single inheritance (class)**  

This combination forms **hybrid inheritance**.

---

## Notes

* Java **does not allow multiple class inheritance** to avoid ambiguity (diamond problem).  
* Interfaces allow multiple inheritance safely.  
* Hybrid inheritance is useful for **complex relationships** in real-world applications.

