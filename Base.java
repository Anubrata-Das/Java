import java.io.*;
public class Base {
    protected double a;
    BufferedReader ad = new BufferedReader(new InputStreamReader(System.in));
    public void getA() {
        try {
            System.out.println("Enter value of a :");
            a = Double.valueOf(ad.readLine());

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}

class Intr extends Base
{
    protected double b;
    public void calB(){
        b= a*10/100;
        System.out.println(b);
    }
}

class Derive extends Intr
{
    protected double c;
    public void add(){
        c=a+b;
        System.out.println(c);
    }
}

class Demo{
    public static void main(String[] args) {
        Derive ob1 = new Derive();
        ob1.getA();
        ob1.calB();
        ob1.add();
    }
}
