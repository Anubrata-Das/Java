import java.util.*;

class Addcontact{
    protected String name;
    protected int number;
    Integer ival=null;
    Vector v = new Vector();

    void aDD(String nm,int num){
        name=nm;
        number=num;

        ival=new Integer(number);
        v.addElement(name);
        v.addElement(ival);;

    }
    void display(){
        for(int i=0;i<v.size();i+=2){
            String nm = (String)(v.elementAt(i));
            System.out.println("Name:  "+nm);
            ival=new Integer(number);
            int num=ival.intValue();
            System.out.println("Number:  "+num);
        }
    }
}

class Search extends Addcontact{
    int fg=0;
    void search(String nm){
        String name=nm;
        for (int i=0;i<v.size();i++){
            String st =(String)(v.elementAt(i));
            if(name.equals(st)){
                fg=1;
                System.out.println(name+" found in phonebook");
                break;
            }
            if(fg==0)
                System.out.println("Not found");
        }
    }

}

class Delete extends Search{

}

public class Phnbook {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Search ob = new Search();
        while (true){
            System.out.println("1.Add new contact");
            System.out.println("2.Search name");
            System.out.println("3.Remove contact");
            System.out.println("Enter ur choice");
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch){
                case 1:
                    System.out.println("Enter name:");
                    String nm = sc.nextLine();
                    System.out.println("Enter Phone number");
                    int num = sc.nextInt();
                    ob.aDD(nm,num);
                    ob.display();
                    break;
                case 2:
                    System.out.println("Enter name to search:");
                    String newname= sc.nextLine();
                    ob.search(newname);
                    break;
            }
        }
    }
}
