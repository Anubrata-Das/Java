public class SingleTonDemo {
    private static SingleTonDemo myObj=null;
    private SingleTonDemo()
    {}
    public void showData(){
        System.out.println("red");
    }
    public static SingleTonDemo getInstance(){
        if(myObj==null){
            myObj=new SingleTonDemo();
        }
        return myObj;
    }
}

class DemoS{
    public static void main(String[] args) {
        SingleTonDemo ob=SingleTonDemo.getInstance();
        ob.showData();
    }
}