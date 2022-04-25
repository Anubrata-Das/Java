import java.util.*;

public class RKD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the full name");
        String s =sc.nextLine();
        String st="";
        for (int i =0;i<s.length();i++){
            char ch =s.charAt(i);
            if(i==0){
                ch=Character.toUpperCase(ch);
                st = st+ ch+ ".";
            }
            if(ch==' '){
                char nextch = s.charAt(i+1);
                nextch=Character.toUpperCase(nextch);
                st= st+ nextch+ ".";
            }
            else
                continue;
        }
        System.out.println(st);
    }
}
