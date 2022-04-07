import java.util.*;
public class Fibo {
    private  int f0,f1,f2;
    Fibo(){
        f0=0;
        f1=1;

    }
    void process(){
        System.out.printf(f0+",");
        f2=f0+f1;
        f0=f1;
        f1=f2;
    }
}

class Fibo1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of terms: ");
        int n=sc.nextInt();
        Fibo ob=new Fibo();
        for (int i=1;i<=n;i++)
            ob.process();
    }

}
