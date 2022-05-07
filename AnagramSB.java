import java.util.*;
class Checkanagram{
    void checkAnagram(StringBuffer sb1,StringBuffer sb2){

        if(sb1.length()!=sb2.length())
            System.out.println(sb1+" and "+sb2+" are not anagram...oops!");
        for(int i=0 ; i<sb1.length();i++){
            char ch = sb1.charAt(i);
            int pos = sb2.indexOf(String.valueOf(ch));
            if(pos != -1)
                sb2.deleteCharAt(pos);
            else
                System.out.println(sb1+" and "+sb2+" are not Anagram....oops!");
        }
        if(sb2.length()==0)
            System.out.println("Yes! they are ANAGRAM!");
    }

}
public class AnagramSB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Checkanagram ob = new Checkanagram();
        System.out.println("Enter 1st string: ");
        StringBuffer sb1 = new StringBuffer(sc.nextLine().toLowerCase());
        System.out.println("Enter 2nd string: ");
        StringBuffer sb2 = new StringBuffer(sc.nextLine().toLowerCase());
        System.out.println("----------------------------------------");
        ob.checkAnagram(sb1,sb2);
    }
}
