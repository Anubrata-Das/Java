import java.util.*;
class Secondmaximum{
    void findsSecMax(int a[]){
        int max = a[0], second_max=a[0];

        for (int i=0;i<a.length;i++){
            if(a[i]>max){
                second_max = max;
                max=a[i];
            }
            else if(a[i]>second_max && a[i]<max)
                second_max = a[i];
        }
        System.out.println("Second maximum number is: "+second_max);
    }
}
public class Secondmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Secondmaximum ob =new Secondmaximum();
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of the array");
        for (int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        ob.findsSecMax(a);
    }
}
