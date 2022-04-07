import java.util.*;
public class State_temp {
    private String state;
    private float temp;

    void getState(String st){
        state=st;
    }

    void getTemp(){
        float a[]=new float[4];
        for(int i=0;i<4;i++){
            System.out.println("Enter "+i+" month temperature :");

        }
    }

//    float aveRage(){
//        float avg;
//
//    }
}

class Average{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        State_temp ob[]=new State_temp[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter state name:");
            String  sname=sc.nextLine();
            for(int j=0;j<3;j++){
                System.out.println("Enter "+j+" month temperature :");
                float tp=sc.nextFloat();
            }

        }

    }

}