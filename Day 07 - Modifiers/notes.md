# Java Access Modifiers

## 1. public
Maximum access modifier.

**Accessible from anywhere:**
- Same class ✔
- Same package ✔
- Subclasses ✔
- Other packages ✔

Think: “Everyone can see and use it.”

---

## 2. default (package-private)
Accessible **only within the same package**.

**Not visible to:**
- Subclasses in other packages ❌
- Classes in other packages ❌

Think: “Only my neighbors in the same package can access it.”

---

## 3. protected
- Accessible in same package (like default)
- Also accessible to subclasses in other packages
- Not accessible to other classes in different packages (if they are not subclass)

Think: “Neighbors + family (subclasses anywhere), but strangers cannot.”

---

## 4. private
Accessible only inside the declared class.

**Not accessible by:**
- Subclasses ❌
- Same package ❌
- Other packages ❌

Think: “My personal diary — only I can see it.”

---

## ✅ Key Difference Table

| Modifier   | Same Class | Same Package | Subclass (same pkg) | Subclass (diff pkg) | Other Package |
|------------|------------|--------------|--------------------|-------------------|---------------|
| public     | ✅ Yes     | ✅ Yes       | ✅ Yes             | ✅ Yes            | ✅ Yes        |
| protected  | ✅ Yes     | ✅ Yes       | ✅ Yes             | ✅ Yes            | ❌ No         |
| default    | ✅ Yes     | ✅ Yes       | ✅ Yes             | ❌ No             | ❌ No         |
| private    | ✅ Yes     | ❌ No        | ❌ No              | ❌ No             | ❌ No         |

**Note:**  
- Protected = default + subclass outside package access  
- Public = everyone
