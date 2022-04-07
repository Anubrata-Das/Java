class NT implements Runnable{
    Thread t;
    NT(){
        t = new Thread(this, "Thread of bhol");
        System.out.println("Child thread: "+ t);
        t.start();
    }
    public void run(){
        try {
            for(int i=5;i>0;i--){
                System.out.println("Child thread : "+ i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e){
            System.out.println("child Interrupted");
        }
        System.out.println("Exiting child thread.");
    }
}

class TD {
    public static void main(String[] args) {
        new NT();
        try {
            for(int i =5;i>0;i--){
                System.out.println("Main thread:"+i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting");
    }
}
