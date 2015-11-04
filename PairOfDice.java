
/**
 * Using the dice program write a class called PAIROFDICE, composed of two DIE objects. 
 * Include methods to set and get the individual die values, a method to roll the dice, 
 * and a method that returns the current sum of the two dice. 
 * Create a driver class called RollingDice2 instance and use a PAIROFDICE object.
 * 
 * Gillian 
 * 10-23
 */
public class PairOfDice
{
        private int x;
        
        Die d1 = new Die();
        Die d2 = new Die();
        int a, b, sum;
       
        public PairOfDice()
        {
            a = 1;
            b = 1;
        }
        public void roll()
        {
            a = d1.roll();
            b = d2.roll();
        }
        public int sum()
        {
            sum = a+b;
            return sum;
        }
        public int getd1()
        {
            return a;
        }
        public int getd2()
        {
            return b;
        }
        public void setd1(int newa)
        {
            a = newa;
        }
        public void setd2(int newb)
        {
            b = newb;
        }
        public String toString()
        {
            return "The number for d1 is " + a + " The number for d2 is " + b + " \nAnd the sum of the two is " + sum;
        }
    }

