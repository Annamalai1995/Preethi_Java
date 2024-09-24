package Core_java.Thread;
class department
{
    void details() throws InterruptedException {
        for(int i=1;i<3;i++)
        {
            System.out.println("Preethi and Sivasankari");
            Thread.sleep(10000);
        }
    }
}
class college
{
    void Colegename() throws InterruptedException {
        System.out.println("SONA and PSG");
        Thread.sleep(10000);
    }
}
public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {
        department dd= new department();
        college cc= new college();
        dd.details();
        cc.Colegename();


    }
}
