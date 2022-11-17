import java.util.*;
class BankAccount {
    private int accno;
    private double balance;
    Scanner sc = new Scanner(System.in);

    public void show() {
        System.out.println("Account no. is " + accno);
        System.out.println("Balance is " + balance);
    }

    public void deposit() {
        long amt;
        System.out.println("Enter depositing amt");
        amt = sc.nextLong();
        balance = balance + amt;
    }

    public void withdraw() {
        long amt;
        System.out.println("Enter amt you want to withdraw");
        amt = sc.nextLong();
        try {
            if (balance >= amt) {
                balance = balance - amt;
                System.out.println("Balance after withdrawl is " + balance);
            } else {
                System.out.println("Your balance is insufficient");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    static class Banking {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("bank details");
            System.out.println("1.Show the account");
            System.out.println("2.Deposit your amt");
            System.out.println("3.Withdraw the amt");
            System.out.println("What is your choice ?");
            int ch;
            ch=sc.nextInt();
            switch (ch){
                case 1:
                    BankAccount ob1 = new BankAccount();
                    System.out.println("Bank balance is " + ob1.balance + "Bank account no. is"
                            + ob1.accno);
                    break;
                case 2:
                    System.out.println("Account no. ? ");
                    String accno=sc.next();
                    System.out.println("enter amount ");
                    BankAccount ob2 = new BankAccount();
                    System.out.println("now balance is " + ob2.balance);
                    break;
                case 3:
                    System.out.println("Account no. ?");
                    accno=sc.next();
                    System.out.println("Enter amount ");
                    BankAccount ob3 = new BankAccount();
                    System.out.println("now balance is "+ob3.balance);
                    break;
            }
        }
    }
}

