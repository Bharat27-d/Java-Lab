import java.util.Scanner;

public class Bank {
    private static double balance = 69420; 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== Welcome to the Bank ====");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");

            System.out.print("Choose an option (1-3): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdraw(scanner);
                    break;
                case 3:
                    deposit(scanner);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    
    private static void checkBalance() {
        System.out.println("Your current balance is: ₹" + balance);
    }

    private static void withdraw(Scanner scanner) {
        System.out.print("Enter amount to withdraw: ₹");
        double amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
            System.out.println("New balance: ₹" + balance);
        }
    }

    private static void deposit(Scanner scanner) {
        System.out.print("Enter amount to deposit: ₹");
        double amount = scanner.nextDouble();

        balance += amount;
        System.out.println("₹" + amount + " deposited successfully.");
        System.out.println("New balance: ₹" + balance);
    }
}
