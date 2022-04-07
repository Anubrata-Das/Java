import java.util.*;

public class Example {
    private int temp1, temp2, temp3;
    private String state;
    float avg;

    void getData(String st, int tp1, int tp2, int tp3) {
        state = st;
        temp1 = tp1;
        temp2 = tp2;
        temp3 = tp3;
        avg=(temp1+temp2+temp3)/3;
    }

    void disPlay() {
        System.out.printf("%-8s %15.2f %n",state,avg);
    }
}
    class Demo7{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            Example st_avg[]=new Example[3];
            for (int i=0;i<3;i++){
                System.out.println("Enter state name : ");
                String nm=sc.nextLine();
                System.out.println("Enter temperature 1 : ");
                int t1=sc.nextInt();
                System.out.println("Enter temperature 2 : ");
                int t2=sc.nextInt();
                System.out.println("Enter temperature 3 : ");
                int t3=sc.nextInt();
                sc.nextLine();
                st_avg[i]=new Example();
                st_avg[i].getData(nm,t1,t2,t3);
            }
            System.out.printf("%-11s %13s %n","STATE","AVERAGE");
            for (int i=0;i<3;i++){
                st_avg[i].disPlay();
            }
        }
    }

