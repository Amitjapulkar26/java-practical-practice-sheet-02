import java.util.Scanner;

class Employee {
    void displayRole() {
        System.out.println("Role: Employee");
    }
}

class Developer extends Employee {
    @Override
    void displayRole() {
        System.out.println("Role: Developer");
    }
}

class Manager extends Employee {
    @Override
    void displayRole() {
        System.out.println("Role: Manager");
    }
}

public class Question07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        Employee employee;

        if (choice == 1) {
            employee = new Employee();
        } else if (choice == 2) {
            employee = new Developer();
        } else if (choice == 3) {
            employee = new Manager();
        } else {
            System.out.println("Invalid choice");
            sc.close();
            return;
        }

        employee.displayRole();
        sc.close();
    }
}
