class Wood { }
class SubWood extends Wood{}

public class Method{
    Wood display(int a){
        System.out.println("PINE");
        return new Wood();
    }
    SubWood display(){
        System.out.println("TEAK");
        return new SubWood();
    }

    public static void main(String[] args) {
        Method m=new Method();
        m.display();
    }
}