public class Methods {
    void show() {
        System.out.println("this is default show() or non-parameterize show() method");
    }

    void show(int a) {
        System.out.println("This is integer-parameterize show() method, " + "a : " + a);
    }
    
    void show(String name) {
        System.out.println("This is String-parameterize show() method, " + "name : " + name);
    }
    public static void main(String[] args) {
        Methods m1 = new Methods();
        Methods m2 = new Methods();
        Methods m3 = new Methods();
        m1.show();
        m2.show(5);
        m3.show("Akshat");
    }
}