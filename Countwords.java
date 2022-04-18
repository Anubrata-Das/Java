import java.util.*;

public class Countwords {
    public static void main(String[] args) {
        System.out.println("Enter any string");
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        int w=0,fg=0;
        for (int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch==' '){
                fg=0;
                continue;
            }
            if(fg==0){
                w++;
                fg=1;
            }
        }
        System.out.println("Total no.of words are: "+w);
    }
}
