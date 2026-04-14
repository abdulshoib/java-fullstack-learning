
class Animal {

    void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class TestPoly {

    public static void main(String[] args) {

        Animal a = new Cat();  // parent reference
        a.sound();             // calls child method
    }
}
