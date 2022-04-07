import java.util.*;

public class Student_Max {
    private int roll,marks;
    private String name;
    private static int max;
    Student_Max(int rl,String nm,int mk){
        roll=rl;
        name=nm;
        marks=mk;
    }
    Student_Max check(Student_Max st){
        if(marks>max){
            max=marks;
            return this;
        }
        else
            return st;
    }
    void display(){
        System.out.println("Maximum marks is:"+marks);
        System.out.println("Name: "+name+"Roll no : "+roll);
    }
}

class stat{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of students");
        int n = sc.nextInt();
        Student_Max stud[] = new Student_Max[n];
        Student_Max std=null;
        for(int i=0;i<n;i++){
            System.out.println("Enter roll no:");
            int rl = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter student name:");
            String nm = sc.nextLine();
            System.out.println("Enter marks:");
            int mk = sc.nextInt();
            stud[i]=new Student_Max(rl,nm,mk);
            std = stud[i].check(std);
        }
        std.display();
    }
}
