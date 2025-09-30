   A
  / \
 B   C
  \ /
   D


- `B` and `C` inherit from `A` → **Hierarchical inheritance**  
- `D` inherits from `B` and `C` → **Multiple inheritance** (via interfaces in Java)  
- Together, this combination is called **Hybrid Inheritance**.

---

## 🔹 Key Points
- Java **does not allow hybrid inheritance using classes alone** (to avoid diamond problem).  
- Java achieves **hybrid inheritance using interfaces** safely.  
- Helps **reuse code from multiple sources** without ambiguity.
