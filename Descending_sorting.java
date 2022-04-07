public class Descending_sorting {
    int temp;
    void Sorting(String[] args){
        int arr[] = new int[args.length];
        for(int i=0;i<args.length;i++){
            arr[i]=Integer.parseInt(args[i]);

        }

        for(int i=0;i<args.length;i++){
            for(int j=i+1;j<args.length;j++){
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<args.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
class Test4{
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("No arguments");
            System.exit(0);
        }
        Descending_sorting sm=new Descending_sorting();
        sm.Sorting(args);
    }
}
