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
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal
{
    public void animalSound()
    {
        System.out.println("The dog says: bow wow");
    }
}

class PolymorphismNew
{
    public static void main(String[] x)
    {
        Animal myAnimal = new Animal(); //create a Animal object
        Animal myPig = new Pig(); //create a Pig object
        Animal myDog = new Dog(); //create a Dog object

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
