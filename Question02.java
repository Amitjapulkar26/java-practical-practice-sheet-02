class A2 {
    int i = 10;
}

class B2 extends A2 {
    int i = 20;
}

public class Question02 {
    public static void main(String[] args) {
        A2 a = new B2();
        System.out.println(a.i);
    }
}
