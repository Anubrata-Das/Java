public class Test {
    private int a=50,b=100;
    void Display(){
        Test t1=new Test();
        System.out.println("a=  " + t1.a + " b=  " + t1.b);
        swap(t1);
        System.out.println("a=  " + t1.a + " b=  " + t1.b);
    }
    void swap(Test t2){
        int temp=t2.a;
        t2.a=t2.b;
        t2.b=temp;
    }
}

class Test_main{
    public static void main(String[] args) {
        Test ob=new Test();
        ob.Display();
    }

}