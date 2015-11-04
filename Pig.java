
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
public class Pig
{
    
    /**
     * Constructor for objects of class Pig
     */
    PairOfDice p1 = new PairOfDice();
    PairOfDice p2 = new PairOfDice();
    int v1, v2, d1, d2, sum;
    
    public Pig()
    {
        p1.roll();
        p2.roll();
    }
    public void cRoll()
    {
        v1 = p1.getd1();
        v2 = p1.getd2();
    }
    public void uRoll()
    {
        d1 = p2.getd1();
        d2 = p2.getd2();
    }
    public int userTurnSum() //calculates sum of two dice values and checks for 1's, returns int
    {
        if (d1 == 1 || d2 == 1) {
            sum = 0;
        } else {sum = d1 + d2;}
        return sum;
    }
    public int compTurnSum()
    {
        if (v1 == 1 || v2 == 1) {
           sum = 0; 
        } else {sum=p1.sum();}
        return sum;
    }
    public boolean userchecktotal()
    {
        if (d1 == 1 && d2 == 1)
            return true;
        else 
            return false;
    }
    public boolean compchecktotal()
    {
        if (v1 == 1 && v2 == 1)
            return true;
        else
            return false;
    }
    public String comptoString()
    {
        return "The computer has rolled " + v1 + ", " + v2 + "\nAnd its sum for this turn is " + compTurnSum(); 
    }
    public String usertoString()
    {
        return "You have rolled " + d1 + ", " + d2 + "\nAnd your sum for this turn is " + userTurnSum(); 
    }
}
