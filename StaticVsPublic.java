public class StaticVsPublic
{
    //static method
    static void myStaticMethod()
    {
        System.out.println("Static methods can be called without creating objects");
    }

    //public method
    public void myPublicMethod()
    {
        System.out.println("Public methods must be called by creating objects");
    }

    //main method
    public static void main(String[] x)
    {
        myStaticMethod(); //call the static method

        StaticVsPublic myObj = new StaticVsPublic(); //create an object of StaticVsPublic Class
        myObj.myPublicMethod(); //call the public method on the object
    }    
}