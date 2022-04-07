import java.util.*;

public class New_Student_array {
    private int roll, marks;
    private String name;

    void getData(int rl, String nm, int mk) {
        roll = rl;
        name = nm;
        marks = mk;
    }

    void disPlay() {
        if (marks > 500) {
            System.out.println("Roll : " + roll + "Name : " + name + "Marks : " + marks);
        }
    }
}
    class Demo9{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no. of students:");
            int n=sc.nextInt();
            New_Student_array stud[]=new New_Student_array[n];
            for(int i=0;i<n;i++){
                System.out.println("Enter roll number :");
                int r=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter name :");
                String nm=sc.nextLine();
                System.out.println(("Enter marks :"));
                int m=sc.nextInt();
                stud[i]=new New_Student_array();
                stud[i].getData(r,nm,m);
            }
            System.out.println("All students details above 500 marks:");
            for(int i=0;i<n;i++){
                stud[i].disPlay();
            }
        }
    }
