public class ConstructorTypes {
    ConstructorTypes() {
        System.out.println("Default Constructor");
    }

    ConstructorTypes(int a) {
        System.out.println(a);
    }

    ConstructorTypes(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        ConstructorTypes c1 = new ConstructorTypes();
        ConstructorTypes c2 = new ConstructorTypes(4);
        ConstructorTypes c3 = new ConstructorTypes("Akshat");
    } 
}