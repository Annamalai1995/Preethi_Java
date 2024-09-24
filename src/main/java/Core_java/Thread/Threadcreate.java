package Core_java.Thread;
//class Threadclass extends Thread{
//    public void run()
//    {
//        System.out.println("Thread created..........");
//    }
//}
class Threadclass implements Runnable
{

    @Override
    public void run() {
        System.out.println("Thread created .....");
    }
}
public class Threadcreate {
    public static void main(String[] args) {
        Threadclass tc = new Threadclass();
        //tc.run();
       // tc.start();
        Thread tt= new Thread();
        tt.start();
    }

}
