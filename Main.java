//learning how to create a class and accessing members(attributes of the class) using an object.

public class Main 
{
    int x;

    public static void main(String[] args)
    {
        Main myObj = new Main();
        myObj.x = 50; //modify attribute values
        System.out.println(myObj.x);
    }
}

