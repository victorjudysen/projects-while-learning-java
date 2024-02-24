abstract class Person
{
    public String fname = "Victor";
    public int age = 21;
    public abstract void study(); //abstract method
}

//subclass (inherit from Person)
class Student extends Person 
{
    public int graduationYear = 2026;
    public void study() // the body of the abstract method
    {
        System.out.println("Studying all day long");
    }
}

class MyClass{
    public static void main(String[] x)
    {
        //create an object of the student class(which inherits attributs and methods from Person)
        Student myObj = new Student();

        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study(); //call abstract method
    }
}