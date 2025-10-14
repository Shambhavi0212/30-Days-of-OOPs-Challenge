# 📅 Java Date and Time

This project demonstrates how to use Java’s **`java.time`** package to work with **dates**, **times**, and **date-time combinations** using modern Java APIs.

---

## 🧠 Overview

Java’s old `Date` and `Calendar` classes were cumbersome and error-prone.  
To simplify date and time handling, **Java 8 introduced the `java.time` package**, which provides cleaner and more intuitive classes.

---

## 📦 Classes Used

| Class | Description |
|--------|-------------|
| `LocalDate` | Represents a date (year, month, day) in the format `yyyy-MM-dd` |
| `LocalTime` | Represents a time (hour, minute, second, nanosecond) |
| `LocalDateTime` | Represents both date and time |
| `DateTimeFormatter` | Used for formatting and parsing date-time objects |

---

## ⚙️ Prerequisites

- Java 8 or higher  
- Any IDE (e.g., IntelliJ IDEA, VS Code, Eclipse) or terminal with `javac`  

---

## 🧩 Features

- Display current **date**
- Display current **time**
- Display current **date and time**
- Format date and time using custom patterns

---

## 🧭 Notes

- The `now()` method retrieves the current system date and time.  
- The `T` in `LocalDateTime` output separates the date and time.  
- You can format date/time using the `DateTimeFormatter` class.  

---

## 🧾 Summary

- Use `LocalDate` for **only dates**  
- Use `LocalTime` for **only times**  
- Use `LocalDateTime` for **date + time**  
- Use `DateTimeFormatter` to **customize output format**

---