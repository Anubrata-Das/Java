import java.util.*;

public class RKDas {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter full name");
        String s =sc.nextLine();
        String st="";
        for (int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch !=' ')
                st =st+ch;
            else {
                char fname = Character.toUpperCase(st.charAt(0));
                System.out.print(fname+".");
                st="";
            }
        }
        String lname="";
        for (int i =0;i<st.length();i++){
            if(i==0)
                lname = lname + Character.toUpperCase(st.charAt(0));
            else
                lname = lname + Character.toLowerCase(st.charAt(i));
        }
        System.out.print(lname);

    }
}
