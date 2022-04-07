import java.util.*;
interface Bank{
    void getDetails(int ac,String nm,double b);
}
interface Withdraw extends Bank{
    void withdraw(double am);
}
interface Deposit extends Bank{
    void deposit(double amt);
}
class Update implements Withdraw,Deposit{
    protected double amount;
    protected double balance;
    protected String name;
    protected int account_num;

    public void getDetails(int ac,String nm,double b){
        account_num = ac;
        name = nm;
        balance = b;
    }
    public void deposit(double amt){
        amount =amt;
        balance = balance+amount;
        System.out.println("Balance after deposit: "+balance);
        System.out.println("---------------------------------------");
    }
    public void withdraw(double am){
        amount=am;
        if(balance<2000)
            System.out.println("Insufficient Balance ! Please Deposit first :-(");
        else {
            balance=balance-amount;
            System.out.println("Balance after withdraw: "+balance);
            System.out.println("---------------------------------------");
        }
    }
    void display(){
        System.out.println("-----------------------------------------");
        System.out.println("Account number: "+account_num);
        System.out.println("Name: "+name);
        System.out.println("Balance: "+balance);
        System.out.println("-----------------------------------------");
    }
}
class Interface {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Update ob = new Update();
        System.out.println("Enter your account number: ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your name: ");
        String n = sc.nextLine();
        System.out.println("Enter the Balance: ");
        double b =sc.nextDouble();
        ob.getDetails(a,n,b);
        ob.display();

        while (true){
            System.out.println("1.Withdraw");
            System.out.println("2.Deposit");
            System.out.println("Enter your choice");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter amount to withdraw:");
                    double amt = sc.nextDouble();
                    ob.withdraw(amt);
                    break;
                case 2:
                    System.out.println("Enter amount to deposit:");
                    double am = sc.nextDouble();
                    ob.deposit(am);
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
