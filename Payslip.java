import java.util.*;
public class Payslip {
    private int id;
    private String name;
    private double salary;

    Payslip(int a,String nm,double b){
        id=a;
        name=nm;
        salary=b;
        System.out.println("Employee ID  "+id+"Name  "+name);
    }

    Payslip(Payslip p1){
        double da=(p1.salary)/5;
        double hra=(p1.salary)/10;
        salary= p1.salary+da+hra;
        System.out.println("Employee DA  "+da+"HRA  "+hra);
    }
    Payslip(Payslip p1,Payslip p2){
        double pf=(p2.salary)/25;
        double it=(p2.salary)/50;
        salary=p2.salary-(pf+it);
        System.out.println("Employee PF  "+pf+"TAX  "+it);
        System.out.println(".............................................");
        System.out.println("Basic salary  "+p1.salary);
        System.out.println("Gross salary  "+p2.salary);
        System.out.println("..............................................");
    }
    void display(){
        System.out.println("Salary  "+salary);
    }
}

class Copy_Const{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee id ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Employee name ");
        String nm=sc.nextLine();
        System.out.println("Enter basic salary ");
        double s=sc.nextDouble();
        Payslip ob1=new Payslip(id,nm,s);
        Payslip ob2=new Payslip(ob1);
        Payslip ob3=new Payslip(ob1,ob2);
        System.out.println("Net salary  ");
        ob3.display();
    }
}
