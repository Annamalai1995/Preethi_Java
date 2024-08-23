package Core_java.oops.Inheritance.Abstraction;

public class abstractaccess extends  car{
    @Override
    public void accelorator() {
        System.out.println("BMW car is accelorator very simple to access");
    }

    @Override
    public void gear() {
        System.out.println("6 speed  manual Gear box or Automatic gear box");
    }

    public static void main(String[] args) {
        abstractaccess ac= new abstractaccess();
        ac.accelorator();
        ac.gear();
        ac.Accesories();



    }
}
