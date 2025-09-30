//Multiple inheritance with multiple classes (not allowed)

class ParentOne {

    void greet() {
        System.out.println("Hello , from Parent1");
    }
}

class ParentTwo {

    void greet() {
        System.out.println("Hello , from Parent2");
    }
}

class Child extends ParentOne 

,ParentTwo
{
    //error
}
// ❌ ERROR if we try this: 👉 This is not supported in Java
public class Main{
    public static void main(String[] args)
    {
        Child obj=new Child();
    }
}