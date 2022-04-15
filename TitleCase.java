import java.util.*;

public class TitleCase {
    public static void main(String[] args) {
        String st="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String s = sc.nextLine();
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(i==0)
                ch=(char)(ch-32);
            else if(ch==' '){
                st = st +" ";
                ch=(char) (s.charAt(i+1)-32);
                i++;
            }
            st = st+ch;
        }
        System.out.println("Title case is "+st);


    }
}
