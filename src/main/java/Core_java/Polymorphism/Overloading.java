package Core_java.Polymorphism;

public class Overloading {
    public void Add(int value1,int value2)
    {
        if(value1==value2)
        {
            System.out.println("The value is equal");
        }
        else if(!(value1==value2))
        {
            System.out.println("Value is not equal");

        }
        else {
            System.out.println("not valid");
        }
    }
    public  float Add(float val1,float val2)
    {
        float add=val1+val2;
        System.out.println("The sum :"+add);
        return  add;


    }
    public void  Add(String place,String place2)
    {
        if(place==place2)
        {
            System.out.println("You are going to coolest place");
        }
        else {
            System.out.println("Not valid");
        }
    }

    public static void main(String[] args) {
        Overloading od= new Overloading();
        od.Add(120,650);
        od.Add(125.5f,658.6f);
        od.Add("Manali","Manali");

    }
}
