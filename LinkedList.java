import java.util.*;

class Node{
    private int data;
    Node next; //reference variable

    void getData(int x){
        data = x;
    }

    void display(){
        System.out.println(data);
    }
}
class LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = 1;
        Node start,temp,current;
        start=temp=current=null;

        while(ch==1){
            temp =new Node();
            if(start==null){
                start=temp;
                current=temp;
            }
            else{
                current.next = temp;
                current = temp;
            }
            System.out.println("Enter any data: ");
            int n = sc.nextInt();
            current.getData(n);
            System.out.println("Press 1 to continue otherwise 0");
            ch=sc.nextInt();
        }
        current.next=null;
        System.out.println("All values are :");
        for (temp=start;temp!=null;temp=temp.next){
            temp.display();
        }
    }
}
