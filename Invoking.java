public class Invoking
{
    protected int a;
    public Invoking(int x)
    {
        a = x;
    }
}
class Inter extends Invoking
{
    protected double b;
    public Inter(int p, double y)
    {
        super(p);
        b = y;
    }
}
class Der extends Inter
{
    private int c;
    public  Der(int i, double j, int k)
    {
        super(i,j);
        c = k;
    }
    public void showData()
    {
        System.out.println(a+"  "+b+"   "+c);
    }
}

class Demo5
{
    public static void main(String[] args) {
        Der ob = new Der(10,7.56,75);
        ob.showData();
    }
}