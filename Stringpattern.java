import java.util.*;
public class Stringpattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any string");
        String s = sc.nextLine();
        for(int i =0 ;i<=s.length();i++){
            System.out.println(s.substring(0,i));
        }
    }
}
