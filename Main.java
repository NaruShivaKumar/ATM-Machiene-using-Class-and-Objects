import java.util.Scanner;

class ATM {
    float Balance;
    int PIN = 1234;

    public void checkpin() {
        System.out.println("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin==PIN){
            menu();
        }
        else{
                System.out.println("Enter Correct Pin");
                checkpin();
        }
    }

    public void menu(){
        System.out.println("Enter your choice");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4.Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt==1){
            checkBalance();
        }
        else if(opt==2){
            withdrawMoney();
        }
        else if(opt==3){
            depositMoney();
        }
        else if(opt==4){
        }
        else{
            System.out.println("Enter valid number");
        }
    }
    public void checkBalance(){
        System.out.println("Balance = "+ Balance);
        menu();
    }
    public void depositMoney(){
        System.out.println("Enter the amount to be deposited: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Amount deposited successfully");
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter the amount to be withdrawn: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else{
            System.out.println("Amount Withdrawn Successfully");
        }
        Balance=Balance-amount;

        menu();
    }
}
public class Main {
    public static void main(String[] args) {
        ATM a = new ATM();
        a.checkpin();
    }
}