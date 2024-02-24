public class ConditionalMethods
{
    static void checkAge(int age)
    {
        if (age<18)
        {
            System.out.println("Access Denied!");
        } else {
            System.out.println("Access Granted!");
        }
    }

    public static void main(String[] x)
    {
        checkAge(2);
    }
}
