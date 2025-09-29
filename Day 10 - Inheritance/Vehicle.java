
public class Vehicle {

    protected String name = "Sham";

    public void display() {
        System.out.println("hi tut tut");
    }
}

class Car extends Vehicle {

    protected String s = "bhavi";

    public static void main(String[] args) {
        Car obj = new Car();
        obj.display();
        System.out.println(obj.name + obj.s);
    }
}
