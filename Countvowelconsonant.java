import java.util.*;
public class Countvowelconsonant {
    public static void main(String[] args) {
        int v=0,c=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any string");
        String s = sc.nextLine();
        s=s.toLowerCase();
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==' ')
                continue;
            else if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                v++;
            else
                c++;
        }
        System.out.println("No. of vowels: "+v+" & No. of consonants: "+c);
    }
}
