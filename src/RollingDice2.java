
/**
 * Continued Assignment PairOfDice
 * 
 * Gillian
 * 10-23
 */
public class RollingDice2
{
   public static void main (String[] args)
   {
       PairOfDice PD = new PairOfDice();
       PD.roll();
       PD.sum();
       System.out.println(PD);
       
       int num1 = PD.getd1();
       int num2 = PD.getd2();
       if(num1 == 1 && num2 == 1)
       {
           System.out.println("We have a snake eye");
       }
       else
       {
           System.out.println("We will now force d1 to be six and d2 to be six too");
           PD.setd1(6);
           PD.setd2(6);
           PD.sum();
           System.out.println(PD);
       }  
   }
}
