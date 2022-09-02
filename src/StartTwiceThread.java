public class StartTwiceThread extends Thread{
    public void run(){
        System.out.println("running...");
    }
    public static void main(String args[]){
        StartTwiceThread t1=new StartTwiceThread();
        t1.start();
        t1.start();
    }
}