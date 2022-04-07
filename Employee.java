import java.util.*;
public class Employee {
    private int id,basic;
    private String name;

    Employee(int a,String nm,int b){
        id=a;
        name=nm;
        basic=b;
    }
    void gs(){
        basic=basic+((basic/5)+(basic/10));
    }
    void nt(){
        basic=basic-((basic/25)+(basic/50));
    }

    Employee(Employee ob1){
        basic=ob1.basic;
    }
    void show1(){
        System.out.println("Employee name = "+ name + ", basic pay =  "+ basic + ", Employee id=  " + id);
    }
    void show2(){
        System.out.println("Gross salary after DA(20%) & HRA(10%) = " + basic);
    }
    void show3(){
        System.out.println("Net salary after deduction of PF(4%) & TAX(2%) = " + basic);
    }
}

class eMp{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee id: ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Employee name: ");
        String name= sc.nextLine();
        System.out.println("Enter basic pay: ");
        int basic=sc.nextInt();
        Employee ob1=new Employee(id,name,basic);
        ob1.show1();
        ob1.gs();
        Employee ob2=new Employee(ob1);
        ob2.nt();
        ob1.show2();
        ob2.show3();

    }
}
