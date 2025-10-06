# 🧩 Java Inner Classes

## 📘 Definition

In Java, an **inner class** is a class defined **within another class**.  
Inner classes are used to **group classes that belong together**, making code more **readable** and **maintainable**.

---

## 🔹 Key Points

- A class defined inside another class is called an **inner class**.  
- Inner classes can be of **different types**:
  - **Regular (non-static) inner class**  
  - **Private inner class**  
  - **Static inner class**  
- Inner classes **can access members (attributes and methods) of the outer class**, including private members.  
- **Private inner classes** cannot be accessed from outside the outer class.  
- **Static inner classes** do **not** require an object of the outer class to be created.  
- Static inner classes **cannot access non-static members** of the outer class.  
- Regular and private inner classes **require an object of the outer class** to be instantiated.  
- Inner classes improve **encapsulation** and **organization** of related classes.  

---

# 🧩 Java Inner Classes - Syntax Reference

## 1️⃣ Regular Inner Class Creation
**OuterClass o = new OuterClass();**  
**OuterClass.InnerClass i = o.new InnerClass();**

## 2️⃣ Incorrect Access of Private Inner Class
**OuterClass o = new OuterClass();**  
**OuterClass.InnerClass i = o.new InnerClass();  //-- ERROR**  

## 3️⃣ Static Inner Class Creation
**OuterClass.InnerClass i = new OuterClass.InnerClass();**  

## 4️⃣ Accessing Attributes of Outer and Inner Class
**System.out.println(o.a + i.b);**  

## 5️⃣ Accessing Method of Inner Class
**System.out.println(i.inmethod());**
