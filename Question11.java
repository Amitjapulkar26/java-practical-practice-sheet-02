import java.util.Scanner;

class Person11 {
    String name;

    void displayPerson() {
        System.out.println("Name: " + name);
    }
}

class Student11 extends Person11 {
    String studentId;

    void displayStudent() {
        System.out.println("Student ID: " + studentId);
    }
}

class GraduateStudent11 extends Student11 {
    String researchArea;

    void displayGraduateStudent() {
        System.out.println("Research Area: " + researchArea);
    }
}

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GraduateStudent11 student = new GraduateStudent11();

        student.name = sc.nextLine();
        student.studentId = sc.nextLine();
        student.researchArea = sc.nextLine();

        student.displayPerson();
        student.displayStudent();
        student.displayGraduateStudent();

        sc.close();
    }
}
