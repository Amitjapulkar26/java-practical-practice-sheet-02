class Grandparent {
    Grandparent() {
        System.out.println("Grandparent constructor");
    }
}

class Parent extends Grandparent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child constructor");
    }
}

public class Question12 {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
