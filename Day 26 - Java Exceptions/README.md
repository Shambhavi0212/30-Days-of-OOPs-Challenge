# Java Exceptions - Try...Catch

## Java Exceptions
Different types of errors can occur while running a Java program, such as coding mistakes, invalid input, or unexpected situations.  

When an error occurs, Java stops execution and generates an error message. Technically, Java **throws an exception**.

---

## Exception Handling (try and catch)
Exception handling lets you **catch and handle errors during runtime**, preventing your program from crashing.  

- **try**: Defines a block of code to be tested for errors during execution.  
- **catch**: allows you to define a block of code to be executed, if an error occurs in the try block  

The `try` and `catch` keywords come in pairs.

---

## Finally
The **finally** statement allows you to execute code **after try...catch**, regardless of whether an exception occurred or not.  

---

## The throw Keyword
The **throw** statement allows you to **create a custom error**.  

It is used together with an exception type. Some common exceptions in Java include:  

- `ArithmeticException`  
- `FileNotFoundException`  
- `ArrayIndexOutOfBoundsException`  
- `SecurityException`  

---

## Errors and Exception Types
Some common errors and exceptions in Java:

| Error/Exception                  | Description                                                    |
|---------------------------------|----------------------------------------------------------------|
| ArithmeticError                  | Occurs when a numeric calculation goes wrong                  |
| ArrayIndexOutOfBoundsException   | Occurs when trying to access an array index that does not exist |
| ClassNotFoundException           | Occurs when trying to access a class that does not exist      |
| FileNotFoundException            | Occurs when a file cannot be accessed                         |
| InputMismatchException           | Occurs when entering wrong input (e.g., text in a numeric input) |
| IOException                      | Occurs when an input or output operation fails                |
| NullPointerException             | Occurs when trying to access an object reference that is null |
| NumberFormatException            | Occurs when converting a string to a numeric type fails       |
| StringIndexOutOfBoundsException  | Occurs when accessing a character in a string that does not exist |

> **Tip:** For a complete list of all errors and exceptions, refer to the Java Errors and Exception Types Reference.

---

## Types of Exceptions in Java

### 1. Checked Exceptions
- Checked at **compile-time**.  
- Must be handled using `try...catch` or declared with `throws`.  
- Examples:  
  - `IOException` – occurs when an input/output operation fails  
  - `FileNotFoundException` – occurs when a file cannot be accessed  
  - `ClassNotFoundException` – occurs when trying to access a class that does not exist  

### 2. Unchecked Exceptions
- Occur at **runtime** and are **not checked at compile-time**.  
- May be handled, but not required.  
- Examples:  
  - `ArithmeticException` – occurs when a numeric calculation goes wrong  
  - `ArrayIndexOutOfBoundsException` – occurs when accessing an invalid array index  
  - `NullPointerException` – occurs when accessing a null object reference  
  - `NumberFormatException` – occurs when string-to-number conversion fails  
  - `StringIndexOutOfBoundsException` – occurs when accessing an invalid string character  

### 3. Errors
- Serious problems **not intended to be caught** by programs.  
- Usually indicate system-level issues.  
- Examples:  
  - `StackOverflowError`  
  - `OutOfMemoryError`  

> **Tip:** Checked exceptions require explicit handling, while unchecked exceptions usually indicate programming errors.
