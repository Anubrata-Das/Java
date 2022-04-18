import java.util.*;
class Contact{
    protected String name;
    protected long number;
    Long ival=null;
    Vector v = new Vector();
    void aDD(String nm,long num){
        name=nm;
        number=num;
        ival=new Long(number);
        v.addElement(name);
        v.addElement(ival);;
    }
    void display(){
        for(int i=0;i<v.size();i+=2){
            String nm = (String)(v.elementAt(i));
            System.out.println("-------------------------------");
            System.out.println("Name:  "+nm);
            ival=(Long) (v.elementAt(i+1));
            long num=ival.longValue();
            System.out.println("Number:  "+num);
            System.out.println("-------------------------------");
        }
    }
    void search(String nm){
        String name=nm;
        int fg=0;
        for (int i=0;i<v.size();i+=2){
            String st =(String)(v.elementAt(i));
            if(name.equals(st)){
                fg=1;
                System.out.println(name+" found in phonebook");
                break;
            }
        }
        if(fg==0)
            System.out.println("Not found");
    }
    void remove(String nm){
        String name = nm;
        int fg=0;
        for(int i=0;i<v.size();i+=2){
            String st =(String) (v.elementAt(i));
            if(name.equals(st)){
                fg=1;
                v.removeElementAt(i);
                v.removeElementAt(i);
                System.out.println("Name is Deleted");
                System.out.println("---------------------------");
                break;
            }
        }
        if(fg==0)
            System.out.println("Name does not exist");
    }
}

public class Phnbook {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Contact ob = new Contact();
        while (true){
            System.out.println("1.Add new contact");
            System.out.println("2.Search name");
            System.out.println("3.Remove contact");
            System.out.println("4.Display all");
            System.out.println("Enter ur choice");
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch){
                case 1:
                    System.out.println("Enter name:");
                    String nm = sc.nextLine();
                    System.out.println("Enter Phone number");
                    long num = sc.nextLong();
                    ob.aDD(nm,num);
                    break;
                case 2:
                    System.out.println("Enter name to search:");
                    String sname= sc.nextLine();
                    ob.search(sname);
                    break;
                case 3:
                    System.out.println("Enter name to delete");
                    String dname=sc.nextLine();
                    ob.remove(dname);
                    break;
                case 4:
                    ob.display();
                    break;
            }
        }
    }
}
