import java.util.*;

class Bank_Account {
    int balance = 0;
    String name;
    long acc_no;
    int choice;
    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.print("\nEnter your Name:- ");
        name = sc.next();

        System.out.print("\nEnter your Account No. :- ");
        acc_no = sc.nextLong();

        System.out.print("\nEnter your Initial Balance :- ");
        balance = sc.nextInt();

        if(balance<=0)
        {
            System.err.print("\nBalance can never be negative!!!!!!");

            System.out.print("\n\nEnter your Initial Balance Again :- ");
            balance = sc.nextInt();
        
        }
    }

    void display() {
        System.out.println("\nName = " + name);
        System.out.println("\nAccount No. = " + acc_no);
        System.out.println("\nBalance = " + balance);
    }
}

class ATM_Machine extends Bank_Account {

    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("Transaction Failure due to Insufficient Balance!!!");
        } else {
            balance -= amount;
            System.out.println("\nAmount has been withdrawn successfully!!!\nTransaction Completed Successfully!!!");
        }
    }

    void deposit(int amount) {
        System.out.println("Amount has been going to deposit!");
        balance += amount;
        System.out.println("\nAmount has been deposited successfully!!!");
    }

    void CheckBalance() {
        System.out.println("Current Balance = " + balance);
    }

    void menu() {
        do {
            System.out.println("\n\n|--------- ATM MENU ---------|");
            System.out.println(
                    "\n1.WITHDRAWN\n2.DEPOSIT\n3.CHECK BALANCE\n4.ACCOUNT DETAILS\n5.EXIT OR CANCEL TRANSACTION\n");

            System.out.print("\nEnter your choice :- ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:

                    System.out.print("\nEnter the amount to be Withdrawn :- ");
                    int amt1 = sc.nextInt();
                    withdraw(amt1);
                    break;
                case 2:

                    System.out.print("\nEnter the amount to be Deposit :- ");
                    int amt2 = sc.nextInt();
                    deposit(amt2);
                    break;
                case 3:

                    CheckBalance();
                    break;
                case 4:

                    System.out.println("\n|--- ACCOUNT DETAILS ---|");
                    display();
                    break;

                case 5:

                    System.out.println("\nExiting the Transaction!!!");
                    System.out.println("\nExited!!!\n");
                    break;
                default:

                    System.out.println("Invalid Choice!!!");
                    break;
            }
        } while (choice != 5);
    }
}

public class jtask3 {
    public static void main(String[] args) {
        ATM_Machine obj = new ATM_Machine();
        obj.input();
        obj.menu();
    }
}
