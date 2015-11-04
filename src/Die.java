
/**
 * Write a description of class Die here.
 * 
 * Gillian
 * 10/23
 */
public class Die
{
    // instance variables - replace the example below with your own
    int MAX = 6;
    int faceValue;

    /**
     * Constructor for objects of class Die
     */
    public Die() //constructor name needs to be the same as the public class declaration
    {
        // initialise instance variables
        faceValue = 1;
    }

    /**
     * Randomly enerates a number between 1 and 6
     */
    public int roll()
    {
       faceValue = (int)(Math.random()*MAX) + 1;// generates a number between 0 and 1.
       return faceValue;
       
    }
    
    /**
     * Change the value of faceValue
     */
    public void setFaceValue(int value)
    {
        faceValue = value;
    }
    
    /**
     * Get the information from faceValue
     */
    public int getFaceValue()
    {
        return faceValue;
    }
    
    public String toString()
    {
        String result = "You have rolled a " + faceValue;
        return result;
    }
}
