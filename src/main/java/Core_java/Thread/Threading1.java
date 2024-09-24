package Core_java.Thread;
class car extends Thread
{
    public  void run() {
        for(int i=0;i<=5;i++)
        {
            System.out.println("Preethi and Sivasankari");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Exception");
            }
        }
    }
}
class bus extends  Thread
{
    public  void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("HELLO");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Exception");
            }
        }
    }
}
public class Threading1 {
    public static void main(String[] args) throws InterruptedException {
        car c= new car();
        bus b= new bus();
        c.start();
        b.start();
        if(c.isAlive())
        {
            System.out.println("Executed");
        }
        c.join();
        b.join();
    }
}
