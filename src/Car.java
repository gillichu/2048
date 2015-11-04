
/**
 * Write a class called Car that contains instance data that represents the make, model, and year of the car. 
 * Define the Car constructor to initialize these values. Include getter and setter methods for all instance data, 
 * and a toString method that returns a on-line description of the car. Add a method called isAntique that returns 
 * a Boolean indicating if the car is an antique (if it is more than 45 years old). Create a driver class called 
 * CarRunner, whose main method instantiates and updates several Car object using Scanner class. Use the isAntique 
 * method to check if the car is an Antique.
 * 
 * Gillian 
 * Oct 26, 2015
 */
public class Car
{
   String make, model;
   int year;

    public Car(String a, String b, int c)
    {
        // initialise instance variables
        make = a;
        model = b;
        year = c;
    }
     public void setMake(String a)
    {
        make = a;
    }
    public void setModel(String b)
    {
        model = b;
    }
    public void setYear(int c)
    {
        year = c;
    }
    public String getMake()
    {
        return make;
    }
    public String getModel()
    {
        return model;
    }
    public int getYear()
    {
        return year;
    }
    public boolean isAntique(int c)
    {
        if (2015-year > 45)
        return true;
        else 
        return false;
    }
    public String toString()
    {
        return "The make of the car is " + make + " and the model is " + model + " and the year is " + year;
    }
}
