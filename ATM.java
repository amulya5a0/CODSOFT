import java.util.*;

class BankAccount {
    int balance, amount;
    Scanner a = new Scanner(System.in);

    void checkBalance() {
        System.out.println("Available balance: $" + balance);
        balance = a.nextInt();
    }

    void deposit() {
        System.out.println("Please enter the money to be deposited: ");
        amount = a.nextInt();
        balance = balance + amount;
        System.out.println("You have successfully deposited $" + amount);
    }

    void withdraw() {
        System.out.println("Enter the money to be withdrawn:");
        amount = a.nextInt();
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Please collect your money $" + amount + " and remove your card");
        } else {
            System.out.println("Sorry! Insufficient balance");
        }
    }

    void displayMenu() {
        int choice;

        do {
            System.out.println("\nAvailable balance: $" + balance);
            System.out.println("Welcome to ATM\n");
            System.out.println("1: Check Balance");
            System.out.println("2: Deposit");
            System.out.println("3: Withdraw");
            System.out.println("4: Exit");
            System.out.println("Enter your choice:");
            choice = a.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for visiting our ATM");
                    break;
                default:
                    System.out.println("Please enter a valid choice");
            }

        } while (choice != 4);
    }
}

class ATM {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.displayMenu();
    }
}