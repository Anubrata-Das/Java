abstract class Base1 {
    public void fun1()
    {
        System.out.println("Red");
        int a=10;
        final int b=20;
        System.out.println(a+"\t"+b);
        a = 20;
        //b = 60;
        System.out.println(a+"\t"+b);
    }
}
final class Derive1 extends Base1{
    public void fun2(){
        System.out.println("Green");
    }
}

class MainMix{
    public static void main(String[] args) {
        Derive1 ob=new Derive1();
        ob.fun2();
        ob.fun1();
    }
}