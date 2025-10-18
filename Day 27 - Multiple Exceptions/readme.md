# Java Multiple Exceptions

## Multiple Exceptions
Sometimes, different errors (exceptions) can occur within the same **try** block.  
we can handle them using **multiple catch blocks**.

---

## One Try, Many Catch
we can add more than one **catch** block, and Java will execute the first one that matches the thrown exception type.

---

## Order Matters
Always place **more specific exceptions first** and **general ones later**.  
If the general `Exception` is placed first, it will catch all exceptions, making the specific ones unreachable.

> 💡 **Tip:** Always put `Exception` (the general one) at the end.

---

## Multi-Catch
Since **Java 7**,we can catch multiple exceptions in a single **catch** block using the **`|` (pipe)** symbol.  
This is useful when multiple exceptions need to be handled in the same way, helping to avoid code duplication.
