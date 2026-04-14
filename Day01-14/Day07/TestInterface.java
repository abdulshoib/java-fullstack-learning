
interface Animal {

    void sound();   // abstract by default
}

class Cat implements Animal {

    public void sound() {
        System.out.println("Cat meows");
    }
}

public class TestInterface {

    public static void main(String[] args) {

        Animal a = new Cat();
        a.sound();
    }
}
