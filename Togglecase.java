import java.util.*;

public class Togglecase {
    public static void main(String[] args) {
        String st = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String s =sc.nextLine();
        String s1 = s.toUpperCase();
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            if(i==0)
                ch = (char) (ch+32);
            else if(ch==' '){
                st = st+" ";
                ch =(char) (s1.charAt(i+1)+32);
                i++;
            }
            st = st+ch;
        }
        System.out.println("Toogle case is: "+st);
    }
}
