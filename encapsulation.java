public class Person 
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

public class main
{
    public static void main(String[] args)
    {
        Person myObj = new Person();
        myObj.name = "John"; // might bring error
        System.out.println(myObj.name); // error
    }
}
