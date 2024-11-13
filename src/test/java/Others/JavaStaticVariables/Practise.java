package Others.JavaStaticVariables;

public class Practise {

    // Make inner class A static
    static class A {
        static void display() {
            System.out.println("A display");
        }
    }

    // Make inner class B static
    static class B extends A {
        static void display() {
            System.out.println("B display");
        }
    }

    public static void main(String[] args) {
        A obj = new B(); // obj is of type A but the actual object is of type B
        obj.display(); // Calls A.display(), because obj is of type A (static methods are not polymorphic)
    }
}
