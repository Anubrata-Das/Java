import java.util.*;

class Phonebook {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector v =new Vector();
        Integer ival=null;
        while (true){
            System.out.println("1.Add new contact");
            System.out.println("2.Search name");
            System.out.println("3.Remove contact");
            System.out.println("4.Display");
            System.out.println("Enter ur choice");
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch){
                case 1:
                    System.out.println("Enter name:");
                    String name = sc.nextLine();
                    System.out.println("Enter Phone number");
                    int number = sc.nextInt();
                    for (int i =0;i<v.size();i++){
                        ival=new Integer(number);
                        v.insertElementAt(name,i);
                        v.insertElementAt(ival,i);
                    }
                    for(int i=0;i<v.size();i++){
                        String nm = (String)(v.elementAt(i));
                        System.out.println("Name:  "+nm);
                    }
                    break;
                case 2:
                    int fg=0;
                    System.out.println("Enter name to search");
                    String nam= sc.nextLine();
                    for (int i=0;i<v.size();i++){
                        String st =(String)(v.elementAt(i));
                        if(nam.equals(st)){
                            fg=1;
                            System.out.println(nam+" found in phonebook");
                            break;
                        }
                        if(fg==0)
                            System.out.println("Not found");
                    }
                case 4:
                    for(int i=0;i<v.size();i++){
                        String nm = (String)(v.elementAt(i));
                        System.out.println("Name:  "+nm);
                        int num=ival.intValue();
                        System.out.println("Number:  "+num);
                    }
            }

        }
    }
}
