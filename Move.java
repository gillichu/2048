
/**
 * Write a description of class Move here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Move
{
GameBoard b1 = new GameBoard();
  public Move(){
      boolean done = false; 
        Scanner s = new Scanner(System.in);
       String input = s.nextLine();
       
       if (input.equalsIgnoreCase ("w"))
            movingup();
       /**if (input.equalsIgnoreCase("s"))
            movingdown();
       if (input.equalsIgnoreCase("a"))
            movingright();
       if (input.equalsIgnoreCase("d"))
            movingleft();
        }**/}
   public boolean movingup(){
            System.out.println("Moving Up!");
            boolean moved = false;
        for(int j = 0; j < 3; j++){
            for(int i = 0; i < 3; i++){
                System.out.println(b1.board[i][j]);
                    if((b1.board[i][j] == 0) && (b1.board[i+1][j] != 0)){
                        System.out.println("up!");
                        b1.board[i][j] = b1.board[i+1][j];
                        b1.board[i+1][j] = 0;
                        moved = true;
                    } else if((b1.board[i][j] != 0) && (b1.board[i][j] == b1.board[i+1][j])){
                        b1.board[i][j] += b1.board[i+1][j];
                        b1.board[i+1][j] = 0;
                        moved = true;
                    }
                }
        }
        return moved;
    }
/**
    private boolean movingright()
    {
        // put your code here
        return moved;
    }
    private boolean movingdown()
    {
        // put your code here
        return moved;
    }
    private boolean movingleft()
    {
        // put your code here
        return moved;
    }}

  **/
}