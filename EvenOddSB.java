import java.util.*;

public class EvenOddSB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        StringBuffer sb = new StringBuffer(sc.nextLine());

        for(int i = 0;i<sb.length();i++){
            char ch = sb.charAt(i);
            if(ch==' '){
                int pos=sb.indexOf(" ");
                if(pos%2==0)
                    sb.setCharAt(pos,'*');
                else
                    sb.setCharAt(pos,'#');
            }
        }
        System.out.println(sb);
    }
}
