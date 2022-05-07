import java.util.*;

public class RemMulSpacesSB {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any string");
        StringBuffer sb = new StringBuffer(sc.nextLine());

        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            if(ch==' ') {
                char chn = (char) (sb.charAt(i + 1));
                if (chn == ' ') {
                    sb.deleteCharAt(i + 1);
                    i--;
                }
            }
        }
        System.out.println(sb);
    }
}
