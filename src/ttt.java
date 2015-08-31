import java.util.Scanner;



public class ttt {
	
	
	//define board
	static String[][] board = new String[3][3];
	
	//main method
	public static void main(String[] args) {	
		System.out.println("shall we play a game?");
		initializeboard(board);
		
	}

	//initialize board
	public static void initializeboard(String[][] gameBoard){	
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 3; i++) {
				System.out.print("[ " + gameBoard[i][j] + " ]");
			}
				System.out.println("");
			}
		
	
	
	
	Scanner xenter= new Scanner(System.in); // store the x coordinate
	Scanner yenter = new Scanner(System.in); // store the y coordinate
	System.out.println("Please enter your desired X coordinate");
	int x = xenter.nextInt();
	System.out.println("Please enter your desired Y coordinate");
	int y = yenter.nextInt(); 
			
			
	
	
	if (int turn = 0) {
	
		
	turn=1
	}
	
	if (turn=1) {
		
	}
	
     //check if occupied
     //if (!board [(i)][j)].equals (" "))
     //keep going
     
     
     
     //System.out.println("Please enter your desired X coordinate");
     //System.out.println("Please enter your desired Y coordinate");
     
     
     /** check winner*/
     
     public  boolean checkBoard ()
     {
    	  for (int i = 0; i < 3; i ++){
              if (board [i][0].equals(board [i][1]) &&
                  board[i][1].equals(board[i][2]) &&
                  !board[i][0].equals (" ")){
            	  return false;}}
            	   
            	  
      	  for (int j = 0; j < 3; j ++){
              if (board [0][j].equals(board [1][j]) &&
                  board[1][j].equals(board[2][j]) &&
                  !board[0][j].equals (" ")){
            	  return false;}}
          
          
          if (board [0][0].equals(board [1][1]) &&
                  board[1][1].equals(board[2][2]) &&    
                  !board[0][0].equals (" ")){ return false;}
        	  
          if (board [0][2].equals(board [1][1]) &&
                  board[1][1].equals(board[2][0]) && 
                  !board[0][2].equals (" ")){ return false;}
        	  
        	  
        
		  return true;
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
