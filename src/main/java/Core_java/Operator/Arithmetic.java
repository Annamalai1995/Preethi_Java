package Core_java.Operator;

public class Arithmetic {
    public void Sum()  // Method creation
    {
        int burger=150;
        int pizza=350;
        int kfc=0;
        //Arithmetic
        //+,-,/,*,%
        kfc=burger+pizza;
        System.out.println("Add Operator:"+kfc);
        kfc=burger-pizza;
        System.out.println("Sub Operator:"+kfc);
        kfc=burger*pizza;
        System.out.println("MUL Operator"+kfc);
        kfc=pizza/burger;
        System.out.println("Div Opeator:"+kfc);
        kfc=pizza%burger;
        System.out.println("Modulo :"+kfc);
    }
    public static void main(String[] args) {
        Arithmetic aa= new Arithmetic();
        aa.Sum();
    }
}
