import java.util.*;
public class Series {
    private int add;
    Series(){
        add=1;
    }
    void process(int x){
        for (int i=0;i<x;i++){
            add=add+i;
            System.out.printf(add+"+");
        }
    }
}

class NewSeries{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of terms:");
        int n=sc.nextInt();
        Series ob=new Series();
        ob.process(n);
    }
}