import java.util.*;

public class ACVC{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string:");
        String s = sc.nextLine();
        String sl = s.toLowerCase();
        String st="";
        for (int i = -1; i<sl.length();i++){
            if(i==-1){
                st =s.substring(0);
                continue;
            }
            char ch = sl.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                st=st.substring(1,s.length());
                st = st +"V";
            }
            else{
                st=st.substring(1,s.length());
                st = st +"C";
            }
            System.out.println(st);
        }

    }
}
