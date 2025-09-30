
class Teacher {

    void teach() {
        System.out.println("Teacher teaches");
    }
}

class Student extends Teacher {

    void study() {
        System.out.println("Student studies");
    }
}

class HomeTuition extends Student {

    void hw() {
        System.out.println("Hometution makes student practice");
    }
}

public class Main {

    public static void main(String[] args) {
        HomeTuition obj = new HomeTuition();
        obj.hw();
        obj.study();
        obj.teach();
    }
}
