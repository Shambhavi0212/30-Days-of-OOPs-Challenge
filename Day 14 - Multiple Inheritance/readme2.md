# Difference Between Class and Interface in Java

## Class
- A class is like a **blueprint** of an object.  
- It can have variables (data/fields) and methods (with implementation).  
- It is used to **define how something works**.  

---

## Interface
- An interface is like a **contract**.  
- It only contains method names (no implementation).  
- A class must **implement** the interface and provide the actual code.  
- It is used to **define what should be done, not how**.  

---

## Key Differences

| Feature        | Class                                | Interface                           |
|----------------|--------------------------------------|-------------------------------------|
| **Definition** | Blueprint of an object               | Contract (set of rules)             |
| **Contains**   | Variables + Methods (with body)      | Only Method names (no body)         |
| **Purpose**    | Defines **how** something works      | Defines **what** should be done     |
| **Keyword**    | `class`                              | `interface`                         |
| **Example**    | Car, Animal                          | Vehicle, RemoteControl              |

---

## Important Points
- Classes → ❌ no multiple inheritance.
- Interfaces → ✅ allow multiple inheritance.
- Diamond problem → handled by forcing override.