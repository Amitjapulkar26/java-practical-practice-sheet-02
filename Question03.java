class A3 {
    {
        System.out.println(1);
    }
}

class B3 extends A3 {
    {
        System.out.println(2);
    }
}

class C3 extends B3 {
    {
        System.out.println(3);
    }
}

public class Question03 {
    public static void main(String[] args) {
        C3 c = new C3();
    }
}
