public class Sample {
    void display(String[] args){
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}
class Test3{
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("No arguments");
            System.exit(0);
        }
        Sample sm=new Sample();
        sm.display(args);
    }
}
