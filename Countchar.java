import java.util.*;
class Charcount{
    void coUnt(String s){
        int c=1;
        String st="";
        for(int i=0;i<s.length()-1;i++){
            char ch = s.charAt(i);
            char chn = s.charAt(i+1);
            if(ch==chn){
                c++;
            }
            else{
                st=st+ch+c;
                c=1;
            }
        }
        System.out.println(st);
    }
}
public class Countchar {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Charcount ob = new Charcount();
        System.out.println("Enter any string:");
        String sn = sc.nextLine();
        sn=sn+" ";
        ob.coUnt(sn);
    }
}
