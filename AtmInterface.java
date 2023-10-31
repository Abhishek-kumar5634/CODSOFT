import java.util.Scanner;

class ATM {
    float balance=1000;
    int pin = 1234;

    public void checkpin() {
        System.out.println("Enter you pin:");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if (enteredpin == pin) {
            menu();
        } else {
            System.out.println("Enter a valid pin");
            
        }
    }

    public void menu() {
        System.out.println("Enter Your Choice:");
        System.out.println("1. Check a/c Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice == 1) {
            checkBalance();
        } else if (choice == 2) {
            withdrawMoney();
        } else if (choice == 3) {
            depositMoney();
        } else if (choice == 4) {
            System.exit(0);
        } else {
            System.out.println("Enter a valid choice");
        }
    }

    public void checkBalance() {
        System.out.println("Balance:" + balance);
        menu();
    }

    public void withdrawMoney() {
        System.out.println("Enter Amount to withdraw:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - amount;
            System.out.println("Money withdrawl Successful");
        }
        menu();
    }

    public void depositMoney() {
        System.out.println("Enter Amount to deposit:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance = balance + amount;
        System.out.println("Money Deposited Sucessfully");
        menu();

    }
}

public class AtmInterface {
   public static void main(String[] args) {
    ATM obj=new ATM();
    obj.checkpin();
   }
}
