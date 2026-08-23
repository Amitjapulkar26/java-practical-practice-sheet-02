import java.util.Scanner;

class Payment {
    void pay(int amount) {
        System.out.println("Payment method: Payment");
        System.out.println("Amount: " + amount);
    }
}

class CreditCard extends Payment {
    @Override
    void pay(int amount) {
        System.out.println("Payment method: Credit Card");
        System.out.println("Amount: " + amount);
    }
}

class UPI extends Payment {
    @Override
    void pay(int amount) {
        System.out.println("Payment method: UPI");
        System.out.println("Amount: " + amount);
    }
}

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        int amount = sc.nextInt();

        Payment payment;

        if (choice == 1) {
            payment = new CreditCard();
        } else if (choice == 2) {
            payment = new UPI();
        } else {
            System.out.println("Invalid choice");
            sc.close();
            return;
        }

        payment.pay(amount);
        sc.close();
    }
}
