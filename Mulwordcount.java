import java.util.*;
class countChar{
    void couNt(String s){
//        String sn = s;
        int c=1,fg=0;
        String st="";
        for (int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(i==s.length()-1) {
                st = st + ch;
                if(c>1)
                    st=st+c;
                break;
            }
            char chn = s.charAt(i+1);
            if(ch==chn){
                c++;
                fg=1;
            }
            else{
                st=st+ch;
                if(fg==1){
                    st=st+c;
                    c=1;
                    fg=0;
                }
            }
        }
        System.out.println(st);
    }
}
public class Mulwordcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        countChar ob =new countChar();
        System.out.println("Enter the string: ");
        String s=sc.nextLine();
        ob.couNt(s);
    }
}
