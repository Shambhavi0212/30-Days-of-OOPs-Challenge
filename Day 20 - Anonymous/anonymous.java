
class Animal {

    public void sound() {
        System.out.println("Animal makes sounds!");
    }
}

public class anonymous {

    public static void main(String[] args) {
        //anonymous class
        Animal a = new Animal() {
            public void sound() {
                System.out.println("woah woah");
            }
        };
        a.sound();
    }
}
