import java.util.*;
public class Repmulspaces {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any string");
        String s =sc.nextLine();
        String st ="";

        for (int i=0; i<s.length(); i++){
            char ch =s.charAt(i);
            if(ch==' '){
                char nextch = s.charAt(i+1);
                if(nextch != ' ')
                    st = st+ ch;
            }
            else
                st=st+ch;
        }
        System.out.println("-------------------------------");
        System.out.println(st);
    }
}
