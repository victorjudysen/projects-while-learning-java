//create a speed class
public class carSpeed
{
    //create a fullThrottle() method
    public void fullThrottle()
    {
        System.out.println("The car is going as fast as possible!");
    }

    //create a speed() method and add a parameter
    public void speed(int maxSpeed)
    {
        System.out.println("Max Speed is: " + maxSpeed);
    }

    //inside main, call the methods on the myCar object
    public static void main(String[] args)
    {
        carSpeed myCar = new carSpeed(); //create a myCar object
        myCar.fullThrottle(); //call the fullThrottle() method
        myCar.speed(200); //call the speed() method
    }
}

