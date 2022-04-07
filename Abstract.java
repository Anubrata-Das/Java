import java.util.*;

abstract class Product{
    protected int product_id;
    protected double price;
    protected String product_name;
    protected double stock;

    Product(int id, String nm, double pr){
        product_id = id;
        product_name = nm;
        price = pr;
    }
    abstract void showInfo();
}
class Purchase extends Product{
    private double  quantity;
     Purchase(int id,String nm,double pr,double qt){
         super(id, nm, pr);
         quantity = qt;
     }
     public void showInfo(){
         stock = stock + quantity;
         System.out.println("Product name: " + product_name);
         System.out.println("Product id : "+product_id);
         System.out.println("Product price :"+ price);
         System.out.println("After purchase stock is " + stock);
     }
}
class Sell extends Product{
    private double quantity;
    Sell(int id,String nm,double pr,double qt){
        super(id, nm, pr);
        quantity = qt;
    }
    public void showInfo(){
        stock = stock - quantity;
        System.out.println("Product name: " + product_name);
        System.out.println("Product id : "+product_id);
        System.out.println("Product price :"+ price);
        System.out.println("After selling stock is " + stock);
    }
}
class Abstract {
    public static void main(String[] args) {
        Product ref = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product id ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter product name ");
        String nm = sc.nextLine();
        System.out.println("Enter the price: ");
        double pr = sc.nextDouble();
        while (true){
            System.out.println("1 . Purchase");
            System.out.println("2.  sell");
            System.out.println("Enter your choice:");
            int ch = sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter quantity for purchase: ");
                    double qt = sc.nextDouble();
                    ref = new Purchase(id,nm,pr,qt);
                    break;
                case 2:
                    System.out.println("Enter quantity for sell: ");
                    double quan = sc.nextDouble();
                    ref = new Sell(id,nm,pr,quan);
                    break;
                default: System.exit(0);
            }
            ref.showInfo();
        }
    }
}
