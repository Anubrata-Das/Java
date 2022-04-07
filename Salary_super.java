import java.util.*;
class Employee1{
    protected int id;
    protected String name;
    protected double salary;
    Employee1(int a,String nm,double b){
        id=a;
        name=nm;
        salary=b;
    }
    void show(){
        System.out.println("--------------------------------------------");
        System.out.println("Employee ID: "+id+"  Name: "+name);
    }
}
class Allowance1 extends Employee1{
    protected double gross_salary;
    protected double da,hra;
    Allowance1(int i, String nam, double ba){
        super( i, nam, ba);
        da=salary/5;
        hra=salary/10;
        gross_salary= salary+da+hra;
    }
    void show(){
        super.show();
        System.out.println("--------------------------------------------");
        System.out.println("Employee DA: "+da+"$"+" and HRA: "+hra+"$");
        System.out.println("Employee's gross salary: "+gross_salary+"$");
    }
}
class Deduct extends Allowance1{
    protected double net_sal;
    protected double pf, it;
    Deduct(int i,String nam,double ba){
        super(i,nam,ba);
        pf=gross_salary/25;
        it=gross_salary/50;
        net_sal=gross_salary-(pf+it);
    }
    void show(){
        super.show();
        System.out.println("Employee's PF: "+pf+"$"+" & TAX: "+it+"$");
        System.out.println("--------------------------------------------");
        System.out.println("Employee's net salary: "+net_sal+"$");
    }
}
public class Salary_super {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee id ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Employee name ");
        String nm=sc.nextLine();
        System.out.println("Enter basic salary ");
        double s=sc.nextDouble();
        Deduct ob = new Deduct(id,nm,s);
        ob.show();
    }
}
