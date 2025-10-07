
interface Animal {

    void sound();
}

public class through_interface {

    public static void main(String[] args) {
        Animal a = new Animal() {
            public void sound() {
                System.out.println("woah woah");
            }
        }; //put semicolon
        a.sound();
    }
}
