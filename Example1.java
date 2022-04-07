import java.util.*;

public class Example1 {
    private String state;
    float avg;

    void getData(String st, int []arr) {
        state = st;
        int total=0;

        for (int i=0;i<arr.length;i++){
            total += arr[i];
        }
        avg=total/arr.length;
    }

    void disPlay() {
        System.out.printf("%-8s %15.2f %n",state,avg);
    }
}
class Demo10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of months :");
        int n=sc.nextInt();
        int month[]=new int[n];
        sc.nextLine();
        Example1 st_avg[]=new Example1[3];

        for (int i=0;i<3;i++){
            System.out.println("Enter state name : ");
            String nm=sc.nextLine();
            for(int j=0;j<n;j++){
                System.out.println("Enter "+(j+1)+"st month temperature: ");
                month[j]=sc.nextInt();
            }
            sc.nextLine();
            st_avg[i]=new Example1();
            st_avg[i].getData(nm,month);
        }
        System.out.println("ALL DETAILS BELOW:");
        System.out.printf("%-11s %13s %n","STATE","AVERAGE");
        for (int i=0;i<3;i++){
            st_avg[i].disPlay();
        }
    }
}

