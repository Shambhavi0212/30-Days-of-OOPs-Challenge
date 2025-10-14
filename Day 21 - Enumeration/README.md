# 🧩 Java Enum

## 📖 Definition

In Java, an **`enum` (enumeration)** is a **special data type** that represent fixed set of **named constants**.  
It is used when a variable should hold only a predefined set of values.

For example, the days of the week (`SUNDAY`, `MONDAY`, …) or directions (`NORTH`, `SOUTH`, …) can be represented as enums.

---

## 🧠 Why Use Enums?

- ✅ To represent **fixed sets of constants**.
- ✅ To make code **more readable and type-safe**.
- ✅ To **avoid using magic numbers or strings** in your code.
- ✅ To easily use in **switch statements**.

---

## 💡 Basic Syntax

```java
enum EnumName {
    CONSTANT1, CONSTANT2, CONSTANT3;
}


## 🏗️ Key Points

✅ Enum constants are **public**, **static**, and **final**.  

🚫 Enum cannot extend a class (it implicitly extends **java.lang.Enum**).  

🔒 Enum constructors are **private by default**.  

💡 Enum can **implement interfaces**.  

🧠 Enums are **type-safe** — you can’t assign invalid values.
