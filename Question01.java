// Question 1: Multiple inheritance is not supported through classes in Java.
// Original invalid syntax:
// class Z extends X, Y { }
//
// Correct approach: use interfaces.

interface X {
    void displayX();
}

interface Y {
    void displayY();
}

class Z implements X, Y {
    public void displayX() {
        System.out.println("Class X");
    }

    public void displayY() {
        System.out.println("Class Y");
    }
}

public class Question01 {
    public static void main(String[] args) {
        Z obj = new Z();
        obj.displayX();
        obj.displayY();
    }
}
