import java.util.Scanner;

public class State_temp_avg {
    private int temp;

    void average(int[]arr){
        int total=0;
        for (int i=0;i<3;i++){
            total += arr[i];
        }
        int avg=total/3;
        System.out.println(avg);
    }
}



class Demo98{
    public static void main(String[] args) {
//        int total=0,avg;
        Scanner sc=new Scanner(System.in);
        State_temp_avg ob[]=new State_temp_avg[3];
        int mo[]=new int[3];
        int av[]=new int[3];
        String state[]=new String[2];
        for(int i=0;i<2;i++){
            System.out.println("Enter state name: ");
            state[i]=sc.nextLine();
            for (int j=0;j<3;j++){
                System.out.println("Enter "+j+" month temperature: ");
                mo[j]=sc.nextInt();
                sc.nextLine();
                ob[i]=new State_temp_avg();
                ob[i].average(mo);
            }

        }
    }
}