public class Test_CC {
    private int a,b;
    Test_CC(int x,int y){
        a=x;
        b=y;
    }
    void process(){
        a=a+10;
        b=b+20;
    }
    Test_CC(Test_CC t1){
        a=t1.a;
        b=t1.b;
    }
    Test_CC(Test_CC t1,Test_CC t2){
        a= t1.a+ t2.a;
        b= t1.b+t2.b;
    }
    void show(){
        System.out.println("a= "+a+"b= "+b);
    }
}
class Demo99{
    public static void main(String[] args) {
        Test_CC t1=new Test_CC(10,20);
        t1.process();
        Test_CC t2=new Test_CC(t1);
        t2.process();
        Test_CC t3=new Test_CC(t1,t2);
        t1.show();
        t2.show();
        t3.show();
    }
}
