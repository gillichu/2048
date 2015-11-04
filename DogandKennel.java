
/**
 * Write a class called Dog and Kennel that contains instance data that represents the dog's name and age. 
 * Define the Dog constructor to accept and intialize instance data. Include getter and setter methods for the name and age.
 * Include getter and setter methods for the name and age. Include a method to compute and return the age of the dog in
 * person years (7 times the dog's age.) Include a toString method that returns a one-line description of the dog.
 * Createa  driver class called Kennel, whose main method instantiates and updates several Dog objects.
 * 
 * Gillian
 * Oct 26th, 2015
 */
public class DogandKennel
{
   int age, humanage;
   String name;
   
    /**
     * Constructor for objects of class DogandKennel
     */
    public DogandKennel(int x, String y)
    {
        age = x;
        name = y;
    }
        public void setName(String y)
    {
        name = y;
    }
     public void setAge(int x)
    {
        age = x;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
    public int HumanYear()
    {
        humanage = age * 7; 
        return humanage;
    }
    public String toString()
    {
        return "The name of the dog is " + name + " the age of the dog is " + age + "the human age of the dog is " + humanage;
    }
}
