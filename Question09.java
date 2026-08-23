import java.util.Scanner;

class Student9 {
    String name;

    Student9(String name) {
        this.name = name;
    }
}

class CollegeStudent9 extends Student9 {
    String course;

    CollegeStudent9(String name, String course) {
        super(name);
        this.course = course;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Course: " + course);
    }
}

public class Question09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String course = sc.nextLine();

        CollegeStudent9 student = new CollegeStudent9(name, course);
        student.display();

        sc.close();
    }
}
