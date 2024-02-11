class Animal
{
    public void animalSound()
    {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal 
{
    public void animalSound()
    {
        System.out.println("The pig says: weee weee");
    }
}

class Dog extends Animal
{
    public void animalSound()
    {
        System.out.println("The dog says: bow wow");
    }
}

public class Polymorphism 
{
    public static void main(String[] args)
    {
        Animal myAnimal = new Animal(); //create an animal object
        Animal myPig = new Pig(); //create a pig object
        Animal myDog = new Dog(); //create a dog object

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
