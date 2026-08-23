import java.util.Scanner;

class Vehicle {
    void start() {
        System.out.println("Vehicle starts.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a button.");
    }
}

public class Question08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        Vehicle vehicle;

        if (choice == 1) {
            vehicle = new Car();
        } else if (choice == 2) {
            vehicle = new Bike();
        } else {
            System.out.println("Invalid choice");
            sc.close();
            return;
        }

        vehicle.start();
        sc.close();
    }
}
