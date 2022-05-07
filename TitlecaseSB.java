import java.util.*;

public class TitlecaseSB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string:");
        StringBuffer sb = new StringBuffer(sc.nextLine());

        for(int i=0 ; i<sb.length(); i++){
            char ch = sb.charAt(i);
            if(i==0)
                ch=(char) (ch-32);
            else if(ch==' ') {
                ch = (char) (sb.charAt(i + 1) - 32);
                i++;
            }
            sb.setCharAt(i,ch);
        }
        System.out.println(sb);
    }
}
