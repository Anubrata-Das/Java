import java.util.*;
public class Revword {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String s = sc.nextLine();
        String st = "";
        String rev = "";
        for (int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch != ' '){
                st = st +ch;
            }
            else {
                rev = " "+st+rev;
                st="";
            }
            if(i==s.length()-1){
                rev = st + rev;
            }
        }
        System.out.println(rev);

    }
}
