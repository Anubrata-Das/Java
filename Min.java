import java.util.*;
public class Min {
    private int a[];
    Min(int x[]){
        a=new int[x.length];
        for (int i=0;i< x.length;i++)
            a[i]=x[i];
    }
    void minimum(){
        int min=a[0];
        for (int i=0;i<a.length;i++){
            if(a[i]<min)
                min=a[i];
        }
        System.out.println("Minimum number is : "+min);
    }
}
class DemoMin{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x[]=new int[5];
        for (int i=0;i<5;i++){
            System.out.println("Enter numbers");
            x[i]=sc.nextInt();
        }
        Min ob=new Min(x);
        ob.minimum();
    }
}
