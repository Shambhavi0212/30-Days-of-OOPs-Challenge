# Java Errors

Even experienced Java developers make mistakes. The key is learning how to spot and fix them!

These pages cover common errors and helpful debugging tips to help you understand what's going wrong and how to fix it.

---

## Types of Errors in Java

| **Error Type** | **Description** |
|----------------|-----------------|
| **Compile-Time Error** | Detected by the compiler. Prevents code from running. |
| **Runtime Error** | Occurs while the program is running. Often causes crashes. |
| **Logical Error** | Code runs but gives incorrect results. Hardest to find. |

---

## Common Compile-Time Errors

Compile-time errors occur when the program cannot compile due to syntax or type issues.

### 1) Missing Semicolon
Happens when a semicolon is not added at the end of a statement.  
**Tip:** Java requires a semicolon at the end of every statement.

### 2) Undeclared Variables
Occurs when you try to use a variable that has not been declared.  
**Tip:** You must declare a variable before using it.

### 3) Mismatched Types
Occurs when the variable type does not match the value assigned.  
**Tip:** Make sure the value matches the variable type.

---

## Common Runtime Errors

Runtime errors occur when the program compiles but crashes or behaves unexpectedly.

### 1) Division by Zero
Happens when a number is divided by zero.  
**Tip:** Always check the denominator before dividing.

### 2) Array Index Out of Bounds
Occurs when you try to access an invalid index in an array.  
**Tip:** Ensure the index value is within the valid range of the array.

---

## Logical Errors

Logical errors happen when the code runs, but the result is not what you expected.  
For example, performing subtraction instead of addition.

**Tip:** Test your program with different inputs to catch logic flaws.  
This is part of debugging, which you will learn more about in the next chapter.

---

## Good Habits to Avoid Errors

- Use meaningful variable names  
- Read the error message carefully and check the line number mentioned  
- Check for missing semicolons or braces  
- Look for typos in variable or method names  

---

### Next Chapter
In the next chapter, you will learn how to **debug your code** — how to find and fix bugs/errors in your program.
