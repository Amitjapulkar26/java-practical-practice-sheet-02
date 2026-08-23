class A4 {
    String s = "Class A";
}

class B4 extends A4 {
    String s = "Class B";

    {
        System.out.println(super.s);
    }
}

class C4 extends B4 {
    String s = "Class C";

    {
        System.out.println(super.s);
    }
}

public class Question04 {
    public static void main(String[] args) {
        C4 c = new C4();
        System.out.println(c.s);
    }
}
