package Core_java.Variables;

public class Demo_variables {
     String Employeename2="Priya"; // Global variable

    static  String Employee_name="Sathish";  //Static variables
    public void Details() //Local Variable
    {
        String EmployeeName1="Annamalai";
        System.out.println("My EmployeeName FIrst:"+EmployeeName1);
        System.out.println("EmployeeName2 is "+Employeename2);
        System.out.println("Hello");
    }


    public static void main(String[] args) {

        //Object Creation:
        //syntax
        //classname objectname= new classname();
        Demo_variables dd= new Demo_variables();
        //objectname.methodname
        dd.Details();


        String CompanyName="Zealous Tech Corp";   //Instance Variable
        System.out.println("My companyName is:"+CompanyName);
        System.out.println("MY Employee Name is:"+Employee_name);

    }
    static
    {
        System.out.println("Welcome to zealous Tech Corp");
    }
}
