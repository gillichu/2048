/**
 * Write a description of class GameBoard here.
 * 
 * Gillian & Taylor
 */
import java.util.Scanner;
public class GameBoard{
    // instance variables - replace the example below with your own
    static int [][] board=new int[4][4];
    private boolean gameover=false;

    /**
     * Constructor for objects of class TwentyFortyEightGameBoard
     */
    public GameBoard()
    {
    }

    public void print()
    {
       randomTwos();
        printBoard();
        Move m = new Move();
        
    }
    /**
     * Prints the image of the board
     */
    private void printBoard(){
        System.out.println("_____________________");
        System.out.println("|    |    |    |    |");
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                if(board[i][j] != 0) {
                    System.out.print(String.format("|%4d", board[i][j]));
                }else{
                    System.out.print("|    ");
                }
            }
            System.out.println("|\n|    |    |    |    |");
            if(i != 3) {
                System.out.println("|____|____|____|____|");
                System.out.println("|    |    |    |    |");
            } else {
                System.out.println("_____________________");
            }
        }
    }
    /**
     * Populates board with two 2 values randomly
     **/
    private int[][] randomTwos(){
        int i= (int)(Math.random()*4);
        int j=(int)(Math.random()*4);
        board[i][j]=2;
        i= (int)(Math.random()*4);
        j=(int)(Math.random()*4);
        board[i][j]=2;
        return board;
    }
    /**private void Move(){
        boolean done = false; 
        Scanner s = new Scanner(System.in);
       String input = s.nextLine();
       
       if (input.equalsIgnoreCase ("w"))
            up();
       if (input.equalsIgnoreCase("s"))
            down();
       if (input.equalsIgnoreCase("a"))
            right();
       if (input.equalsIgnoreCase("d"))
            left();
            
        }
        /**
        private boolean up(){
            System.out.println("Moving Up!");
            boolean nextRow;
    boolean moved = false;

    for(int j = 0; j < 4; j++){
        boolean[] collapsed = new boolean[4];
        do{
            nextRow = true;
            for(int i = 3; i > 0; i--){
                System.out.println(board[i][j]);
                if((board[i][j] == 0) && (board[i-1][j] != 0)){
                    board[i][j] = board[i-1][j];
                    board[i-1][j] = 0;
                    nextRow = false;
                    moved = true;
                } else if((board[i][j] != 0) && (board[i][j] == board[i-1][j]) && !collapsed[i] && !collapsed[i-1]){
                    board[i][j] += board[i-1][j];
                    board[i-1][j] = 0;
                    collapsed[i] = true;
                    nextRow = false;
                    moved = true;
                }
            }
        } while(!nextRow);
    }
    return moved;
}
**/
// refuses to print it again??

        public void down(){
            
        }
        public void left(){
            
        }
        public void right(){
            
        }
    
}


    // randomValue?
    // Shifting! 
    
   