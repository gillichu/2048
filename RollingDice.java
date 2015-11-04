
/**
 * The script of the Die methods.
 * 
 * Gillian
 * 10-23
 */
public class RollingDice
{
   public static void main (String[] args)
   {
       Die d1 = new Die();
       Die d2 = new Die();
       int sum;
       
       d1.roll();
       d2.roll();
       System.out.println(d1 + "\n" + d2); // refers to the toString() method
       System.out.println();
       
       d1.roll();
       d2.setFaceValue(6);
       System.out.println(d1 + "\n" + d2);
       System.out.println();
       
       sum = d1.getFaceValue() + d2.getFaceValue();
       System.out.println("The sum is " + sum);
   }
}
