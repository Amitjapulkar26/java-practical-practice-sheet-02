class A5 {
    static {
        System.out.println("THIRD");
    }
}

class B5 extends A5 {
    static {
        System.out.println("SECOND");
    }
}

class C5 extends B5 {
    static {
        System.out.println("FIRST");
    }
}

public class Question05 {
    public static void main(String[] args) {
        C5 c = new C5();
    }
}
