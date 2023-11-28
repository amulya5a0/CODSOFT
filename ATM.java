import java.util.*;
class BankAccount{
    int balance ,withdraw,deposit;
    Scanner a = new Scanner(System.in);
     int amount ;
        void checkBalance(){
            System.out.println("avilable balance = " + balance);
            balance = a.nextInt();
        }
        void deposit(){
            System.out.println("please enter the money to be deposited : ");
            amount = a.nextInt();
            deposit = balance + amount;
            System.out.println("your have sucessfully deposited  $" + amount); 
        }
        void withdraw(){
            System.out.println("enter the money to be withdraw :");
            amount = a.nextInt();
            if(amount > 0 && amount <= balance){
                withdraw = balance - amount;
                System.out.println(" please collect your money  $" + amount + " and remove your card " );
            }
            else{
                System.out.println("sorry! insufficient balance ");
            }
        }
        void displayMenu(){
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            while(choice<=4){
                System.out.print("welcome to ATM  \n");
                System.out.print("1 : checkBalance \n");
                System.out.print("2 : deposit  \n");
                System.out.print("3 : withdraw \n");
                System.out.print("4 : exit \n");
                System.out.println("enter the avilable balance ");
                balance = sc.nextInt();
                System.out.print("enter your choice : " );
                choice = sc.nextInt();
                switch(choice){
                    case 1:
                        checkBalance();
                        sc.nextInt();
                        break;
                    case 2:
                        deposit();
                        sc.nextInt();
                        break;
                    case 3:
                        withdraw();
                        sc.nextInt();
                        break;
                    case 4:
                        System.out.println("Thank you for visiting our ATM ");
                        break;
                    default:
                        System.out.println("please enter a valid choice ");
                }
            }
        }
}
class ATM{
    public static void main(String[] args){
        BankAccount b = new BankAccount();
                    b.displayMenu();
                    b.checkBalance();
                    b.deposit();
                    b.withdraw();
    }
}