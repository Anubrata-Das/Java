import java.util.*;
public class MyVector {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector v=new Vector();
        for(int i=0;i< args.length;i++)
            v.addElement(args[i]);

        System.out.println("Enter any name: ");
        String nm =sc.nextLine();
        int fg=0;
        for (int i=0;i< v.size();i++){
            String st=(String)(v.elementAt(i));
            if(nm.equals(st)){
                fg=1;
                System.out.println(nm+" found in vector");
                v.removeElement(i);
                break;
            }
        }
        if(fg==0){
            System.out.println("Not found "+nm);
            v.insertElementAt(nm,0);
        }
        System.out.println("All values are");
        for(int i=0;i<v.size();i++){
            nm=(String)(v.elementAt(i));
            System.out.println(nm);
        }
    }

}

