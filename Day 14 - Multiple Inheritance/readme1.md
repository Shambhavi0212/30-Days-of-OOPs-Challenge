# 📘 Multiple Inheritance, Diamond Problem & Interfaces in Java  

## 🔹 1. Multiple Inheritance – Definition  
- Multiple inheritance means **a class trying to inherit from more than one parent class**.  
- Example: If `Child` inherits from both `ParentOne` and `ParentTwo`.  

---

## 🔹 2. Why Java Does Not Support Multiple Inheritance with Classes  
- Java designers avoided multiple inheritance to **prevent ambiguity**.  
- If two parent classes have the **same method name**, the child class won’t know which method to use.  
- This situation is called **ambiguity**.  

---

## 🔹 3. Diamond Problem  

### Structure:  
Diamond Problem:
       GrandParent
          greet()
         /      \
 ParentOne    ParentTwo
    greet()     greet()
         \      /
          Child ❌ (confusion: which greet() to use?)


### Explanation:  
- `ParentOne` and `ParentTwo` inherit from `GrandParent`.  
- `Child` inherits from both `ParentOne` and `ParentTwo`.  
- If `GrandParent` has a method `greet()` and both `ParentOne` and `ParentTwo` override it,  
👉 when `Child` calls `greet()`, it is **unclear which version should run**.  

This is called the **Diamond Problem**.  

---

## 🔹 4. Solution in Java → Interfaces  
- Java supports **multiple inheritance through interfaces**.  
- Interfaces contain only method declarations (no implementation), so there is no ambiguity.  
- A class can implement multiple interfaces safely.  
- From **Java 8 onwards**, interfaces can have **default methods**.  
  - If two interfaces provide the same default method, the implementing class **must override it**, resolving ambiguity.  

---

## ✅ Summary  
- **Multiple Inheritance (with classes)** → ❌ Not supported in Java.  
- **Reason** → To avoid ambiguity & diamond problem.  
- **Interfaces** → ✅ Provide safe multiple inheritance.  
- **Default methods (Java 8+)** → If conflict occurs, Java forces the child class to override.  
