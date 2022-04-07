import java.util.*;
class Electricity{
    protected String  con_name;
    protected int con_id ;
    Electricity(int c_id, String c_nm){
        con_id = c_id;
        con_name = c_nm;
    }
    void display(){
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Consumer name: "+ con_name + " & Consumer id: "+con_id);
    }
}

class meter extends Electricity{
    protected double meter_rent;
    protected double sub_charge;
    meter(int cid,String cname,double mr,double sc){
        super(cid,cname);
        meter_rent = mr;
        sub_charge = sc;
    }
    void display(){
        super.display();
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Your meter rent is: "+ meter_rent+" rupees"+ " & sub charge amount is: "+ sub_charge+" rupees");
    }
}

class Bill extends meter{
    private double unit_consumed, unit_amt;
    private double payable_amount;
    Bill(int cid,String cname,double mr,double sc,double unit_con){
        super(cid, cname, mr, sc);
        unit_consumed = unit_con;
        unit_amt = (100*5.50)+(100*6.50)+((unit_consumed - 200)*8);
        payable_amount = meter_rent + sub_charge + unit_amt;
    }
    void display(){
        super.display();
        System.out.println("Your unit consumed: "+unit_consumed+" unit"+" and that unit amount is: "+ unit_amt+" rupees");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Total payable amount is : "+ payable_amount+" rupees");
    }
}

public class Electric_Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter consumer id:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("enter consumer name:");
        String nm = sc.nextLine();
        System.out.println("Enter meter rent:");
        double mr = sc.nextDouble();
        System.out.println("Enter sub-charge");
        double s_charge = sc.nextDouble();
        System.out.println("Enter the UNIT consumed:");
        double uc = sc.nextDouble();
        Bill ob = new Bill(id,nm,mr,s_charge,uc);
        ob.display();
    }
}
