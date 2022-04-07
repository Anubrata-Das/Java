import java.util.*;
public class Max {
    private int a[];
    Max(int x[]){
        a=new int[x.length];
        for (int i=0;i< x.length;i++)
            a[i]=x[i];
    }
    void maximum(){
        int max=a[0];
        for (int i=0;i<a.length;i++){
            if(a[i]>max)
                max=a[i];
        }
        System.out.println("Maximum number is : "+max);
    }
}

class DemoMax{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x[]=new int[5];
        for (int i=0;i<5;i++){
            System.out.println("Enter numbers");
            x[i]=sc.nextInt();
        }
        Max ob=new Max(x);
        ob.maximum();
    }
}
