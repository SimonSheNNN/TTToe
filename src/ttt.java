

public class ttt {
	public static void main (String [] args)
	{private String[][] board;
     private static int ROWS = 3;
     private static int COLUMNS = 3;
     
     public ttt()
     {
          board = new String[ROWS][COLUMNS];
          initializeBoard();
     }
     
     
     /** initialize board*/
     public void initializeBoard ()
     {
          for (int i = 0; i < ROWS; i++)
               for (int j = 0; j < COLUMNS; j++)
               board [i][j] = " ";
     
	}
     
     
     //check if occupied
     //if (!board [(i)][j)].equals (" "))
     //keep going
     
     
     
     //System.out.println("Please enter your desired X coordinate");
     //System.out.println("Please enter your desired Y coordinate");
     
     
     /** check winner*/
     
     public String checkBoard ()
     {
    	  for (int i = 0; i < ROWS; i ++)
              if (board [i][0].equals(board [i][1]) &&
                  board[i][1].equals(board[i][2]) &&
                  !board[i][0].equals (" "))
            	  // need more 
            	  
      	  for (int j = 0; j < COLUMNS; j ++)
              if (board [0][j].equals(board [1][j]) &&
                  board[1][j].equals(board[2][j]) &&
                  !board[0][j].equals (" "))
              	 // same here
            	  
          if (board [0][0].equals(board [1][1]) &&
                  board[1][1].equals(board[2][2]) &&    
                  !board[0][0].equals (" "))
        	  
          if (board [0][2].equals(board [1][1]) &&
                  board[1][1].equals(board[2][0]) && 
                  !board[0][2].equals (" "))
        	  
        	  
        	  System.out.println("You won!");
     }
     // end initializeBoard method
     
     //define string instances for player1's mark x, player2's mark o, and the board;
	//initializing the board to a 3x3 array;
	
	//print out the board:
	//define int x and y for the length and width of the board
	//x=0, when x<3, print -
	//y=0, when y<3, print |
	//else print ""
	
	//make and track moves by each player
	//two new int a and b, as the coordinates player typed in
	//a=b=-1
	//a + the number player typed = the x coordinate of this move //must be integer
	//a<= 3, or notice the player to reenter
	//check if the space is occupied, if so, print reenter
	//same with b
	//print the string play1/2's mark as a and b's coordinates indicate
	
	//check winner
	//if a or b of one player's mark include all 1-3, println: player , you win!
	//if one player has all a=1 b=1, a=2 b=2, a=3 b=3; or a=3 b=1, a=2 b=2, a=1 b=3; println: player , you win
	//int move=0, if have an a or b intake, move++
	//if move>9, println: it's a draw
	

}
