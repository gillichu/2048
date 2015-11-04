
/**
 * On each turn, the current player rolls a pair of dice and accumulates points. 
 * The goal is to reach 100 points before your opponent does. If, on any turn, the player 
 * rolls a 1, all points accumulated for that round are forfeited and control of the die 
 * moves to the other player. If the player rolls two 1s in one turn, the player loses all 
 * points accumulated thus far and loses control of the dice. The player may voluntarily 
 * give up the dice after each roll. Therefore the player must decide to roll again and risk 
 * losing points, or relinquish control of the dice, possibly allowing the other player to win. 
 * Implement the computer player such that it always relinquishes the dice after accumulating
 * 20 or more points in any given round.
 * 
 * Gillian
 * Oct 27, 2015
 */

import java.util.Scanner;
public class PigRunner
{
   public static void main(String[] args)
   {
       int PlayerCount = 0, CompCount = 0, TotalComp = 0;
       String another = "y";
       String keepgoing = "GO";
       Scanner s = new Scanner(System.in);
       Scanner s2 = new Scanner(System.in);
       
       while (keepgoing.equalsIgnoreCase("GO"))
       {
       while (another.equalsIgnoreCase("y")) // User
       {
       Pig p1 = new Pig();
       p1.uRoll();
       boolean c = p1.userchecktotal();
       int sum = p1.userTurnSum();
       System.out.println(p1.usertoString());
       PlayerCount += sum;
       if (c == true)
       {
           PlayerCount = 0;
           another = "n";
       }
       System.out.println("Your total is " + PlayerCount );
       System.out.println("Would you like to play? (y/n)");
       another = s.nextLine();
       
    }
       while (another.equalsIgnoreCase("n") && CompCount <= 20) // Computer
        {
            Pig p2 = new Pig();
            p2.cRoll();
            boolean d = p2.compchecktotal();
            int sum2 = p2.compTurnSum();
            System.out.println(p2.comptoString());
            CompCount += sum2;
            TotalComp += sum2;
            if (d == true)
            {
                CompCount = 0;
                another = "y";
            }
            System.out.println("The computer's total is " + TotalComp);
        }
       if (PlayerCount >= 100 || TotalComp >= 100){
           keepgoing = "nope";
       }
       System.out.println("Would you like to play? (y/n)");
       another = s.nextLine();
       keepgoing = "GO";
    }
    System.out.println("Game over!");
}
}

