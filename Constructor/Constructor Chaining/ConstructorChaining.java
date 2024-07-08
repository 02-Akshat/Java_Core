public class ConstructorChaining {
    ConstructorChaining() {
        this(4);
        System.out.println("Default Constructor");
    }

    ConstructorChaining(int a) {
        System.out.println(a);
    }

    ConstructorChaining(String name) {
        this();
        System.out.println(name);
    }
    
    public static void main(String[] args) {
        ConstructorChaining c1 = new ConstructorChaining("Akshat");
    }
}