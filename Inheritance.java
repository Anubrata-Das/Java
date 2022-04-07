import java.util.*;
class Single_Employee{
    protected int id;
    protected String name;
    protected double salary;
    void getData(int a,String nm,double b){
        id=a;
        name=nm;
        salary=b;
    }
    void show_basic(){
        System.out.println("Employee ID  "+id+"Name  "+name);
    }
}
class Allowance extends Single_Employee{
    protected double gross_salary;
    protected double da,hra;
    void allowance(){
        da=salary/5;
        hra=salary/10;
        gross_salary= salary+da+hra;
    }
    void show_allowance(){
        System.out.println("Employee DA  "+da+"HRA  "+hra);
        System.out.println("Gross salary: "+gross_salary);
    }
}

class Deduction extends Allowance{
    protected double net_sal;
    protected double pf, it;
    void deduct(){
        pf=gross_salary/25;
        it=gross_salary/50;
        net_sal=gross_salary-(pf+it);
    }
    void show_deduction(){
        System.out.println("Employee PF  "+pf+"TAX  "+it);
        System.out.println("Net salary: "+net_sal);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee id ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Employee name ");
        String nm=sc.nextLine();
        System.out.println("Enter basic salary ");
        double s=sc.nextDouble();
        Deduction ob = new Deduction();
        ob.getData(id,nm,s);
        ob.allowance();
        ob.deduct();
        ob.show_basic();
        ob.show_allowance();
        ob.show_deduction();

    }
}
