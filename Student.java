public class Student {
    private  int roll, marks;
    private String name;
    void getData(int rl,String nm,int mk){
        roll=rl;
        marks=mk;
        name=nm;
    }
    Student maxStud(Student ob){
        if(marks> ob.marks){
            return this;
        }
        else
            return ob;
    }
    void display(){
        System.out.println("Marks: "+marks+"Name: "+name+"Roll no : "+roll);
    }
}
class Result{
    public static void main(String[] args) {
        Student stud1=new Student();
        Student stud2=new Student();
        stud1.getData(2255,"Anubrata",950);
        stud2.getData(5533,"Alllu",800);
        Student stud=stud1.maxStud(stud2);
        stud.display();
    }
}
