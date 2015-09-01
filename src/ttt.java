import java.util.Scanner;



public class ttt {
	
	
	private static final String s="X" ;
	private static final String d="o" ;
	static int turn=0;
	static String[][] board = new String[3][3];
	static boolean player1 = true;
	
	
	
	public static void main(String[] args) {	
		System.out.println("shall we play a game?");
		initializeboard(board);
		 Tic(board);
		player1 = !player1;
		turn=0;
		if (checkBoard()) { 
		System.out.println("We have a winner! Congrats!");
		System.exit(0);
		}//close checkboard
		if (turn==9){System.out.println("it's a draw");}
	}//close main

	
	
	//initialize board
	public static void initializeboard(String[][] gameBoard){	
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 3; i++) {
				System.out.print("[ 0 ]");
			}//close for loop
				System.out.println("");}//close 2nd loop
			}//close initializeboard
		
	
	
		public static String[][] Tic(String[][] board) {
	Scanner in= new Scanner(System.in); // store the x coordinate
	System.out.println("Please enter your desired X coordinate");
	int i = in.nextInt();
	System.out.println("Please enter your desired Y coordinate");
	int j = in.nextInt(); 
	
	//if((in.nextInt()<1 || in.nextInt() >3))
	//{System.out.print("please enter a valid coordinate");
	//}
	
	turn++;
	if (player1) {
		board[i][j] = s;
	} else {
		board[i][j] = d;
	}
	
	
	return board;
}//close tic()
	
			
	

     
     
     /** check winner*/
     
     public static boolean checkBoard ()
     {
    	  for (int i = 0; i < 3; i ++){
              if (board [i][0].equals(board [i][1]) &&
                  board[i][1].equals(board[i][2]) &&
                  !board[i][0].equals (" ")){ return true;}}
            	   
            	  
      	  for (int j = 0; j < 3; j ++){
              if (board [0][j].equals(board [1][j]) &&
                  board[1][j].equals(board[2][j]) &&
                  !board[0][j].equals (" ")){
            	  return true;}}
          
          
          if (board [0][0].equals(board [1][1]) &&
                  board[1][1].equals(board[2][2]) &&    
                  !board[0][0].equals (" ")){ return true;}
        	  
          if (board [0][2].equals(board [1][1]) &&
                  board[1][1].equals(board[2][0]) && 
                  !board[0][2].equals (" ")){ return true;}
        	 
         if (turn>=9);
         { 
         return false;}
         
         }//close checkboard
          
     
     
     
     
     
     
     
     
     
     
     
     
     
	//make and track moves by each player
	//two new int a and b, as the coordinates player typed in
	//a=b=-1
	//a + the number player typed = the x coordinate of this move //must be integer
	//a<= 3, or notice the player to reenter
	//check if the space is occupied, if so, print reenter
	//same with b
	//print the string play1/2's mark as a and b's coordinates indicate

}
