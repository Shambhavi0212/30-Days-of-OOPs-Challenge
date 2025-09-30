
interface CanRun {

    void run();
}

interface CanJump {

    void jump();
}

class Athelete implements CanRun, CanJump {

    public void run() {
        System.out.println("Athelete can run!!!");
    }

    public void jump() {
        System.out.println("Athelete can jump!!!");
    }
}

public class MultipleInheritanceWithInterfaces {

    public static void main(String[] args) {
        Athelete a = new Athelete();
        a.run();
        a.jump();
    }
}
