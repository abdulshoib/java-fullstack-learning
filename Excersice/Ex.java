
// class A {
//     void showA() {
//         System.out.println("From A");
//     }
// }
// class B extends A {
//     void showB() {
//         System.out.println("From B");
//     }
// }
// class C extends B {
//     void showC() {
//         System.out.println("From c");
//     }
// }
// class Ex {
//     public static void main(String[] args) {
//         c obj = new c();
//         obj.showA();
//         obj.showB();
//         obj.showC();
//     }
// }
class Shape {

    void draw() {
        System.out.println("Drwaing a Shape");

    }
}

class Circle extends Shape {

    void area() {
        System.out.println("Area of a circle");
    }
}

class Square extends Shape {

    void area() {
        System.out.println("Area of a Square");
    }
}

class Ex {           //Hierarchical Inheritance

    public static void main(String[] args) {
        Circle cr = new Circle();
        cr.draw();
        cr.area();
        Square sr = new Square();
        sr.draw();
        sr.area();
    }
}
