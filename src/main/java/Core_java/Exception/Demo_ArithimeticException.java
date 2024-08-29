package Core_java.Exception;

public class Demo_ArithimeticException {
    public static void main(String[] args) {
        try {
            int data=500;
            int value=0;
            int res=data/value;
            System.out.println(res);
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Hello there");
        int a=10;
        int b=20;
        int c= a+b;
        System.out.println(c);
    }
}
