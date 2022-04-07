import java.util.*;

class Amount{
    private int id,amount;
    private String name;
    private static int total;
    Amount(int i,String nm,int am){
        id=i;
        name=nm;
        amount=am;
    }
    void process(){
        total=amount+total;
    }
    void display(){
        System.out.println("Customer name: "+ name+"| ID "+id+" | Purchasing amount: "+amount);
    }
    static void showTotal(){
        System.out.println("------------------------------------------------");
        System.out.println("Total purchasing amount: "+total);
    }
}

class Customer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of customers");
        int n = sc.nextInt();
        Amount cus[] = new Amount[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter id no:");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter customer name:");
            String nm = sc.nextLine();
            System.out.println("Enter purchasing amount:");
            int amount = sc.nextInt();
            cus[i]=new Amount(id,nm,amount);
            cus[i].process();
        }
        System.out.println("All details are ");
        System.out.println("-----------------------------------------------");
        for(int i=0;i<n;i++)
            cus[i].display();
        Amount.showTotal();
    }
}
