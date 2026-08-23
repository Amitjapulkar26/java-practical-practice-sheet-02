class A6 {
    public A6() {
        System.out.println("Class A Constructor");
    }
}

class B6 extends A6 {
    public B6() {
        System.out.println("Class B Constructor");
    }
}

class C6 extends B6 {
    public C6() {
        System.out.println("Class C Constructor");
    }
}

public class Question06 {
    public static void main(String[] args) {
        C6 c = new C6();
    }
}
