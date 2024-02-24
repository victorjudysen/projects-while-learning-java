class Person
{
    private String name; //private = restricted access

    //getter
    public String getName()
    {
        return name;
    }

    //setter
    public void setName(String newName)
    {
        this.name = newName;
    }
}

public class Encaps
{
    public static void main(String[] x)
    {
        Person myObj = new Person();
        myObj.setName("Victor");//set the value of the name variable to Victor
        System.out.println(myObj.getName());
    }
}
