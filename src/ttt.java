import java.util.Scanner;



public class ttt {
	
	
	public static void main(String[] args) {	
		String[][] board = new String[3][3];
		boolean player1 = true;
		System.out.println("shall we play a game?");
		int turn=0;
		
		
		while(checkBoard(board,turn)){
		printBoard(board,turn);
		board=tic(board,player1);
		player1=!player1;
		turn++;
		}
		
	}//close main

	
	
	//initialize board
	public static void printBoard(String[][] board,int turn){	
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 3; i++) {
				if(board{i}{j} == null){
					System.out.print("[ - ]");
				}
				else{
					System.out.print("[" + board{i}{j} + "]");
				}
				
			}//close first loop
				System.out.print("\n");}//close 2nd loop
			System.out.print("\n");
		}
		
	
	
		public static String[][] tic(String[][] board, boolean player1) {
			Scanner in= new Scanner(System.in); // store the x coordinate
			while (true) {
				System.out.println("Please enter your desired X coordinate");
				int i = in.nextInt();
				System.out.println("Please enter your desired Y coordinate");
				int j = in.nextInt(); 
				if ((i>=0 || i <=2)){
					if (player1) {
						board[i][j] = "X";
						return board;
					} else {
						board[i][j] ="o";
						return board;
						}  
					}
					System.out.println("Error in your input");
				}
			}
     
     
     /** check winner*/
     
     public static boolean checkBoard (String[][] board, int turn){
     
    	  for (int i = 0; i < 3; i ++){
              if (board [i][0]==board [i][1]) && board[i][1]==board[i][2]) && turn >5){
                  System.out.println("We have a winner!");
                  return false;
                  }
              }
            	   
            	  
    	  for (int j = 0; j < 3; j ++){
              if (board [0][j]==board [1][j]) && board[1][j]==board[2][j]) && turn >5){
                  System.out.println("We have a winner!");
                  return false;
                  }
              }
          
          
          if (board [0][0]==board [1][1]) && board[1][1]==board[2][2]) && turn >5){
              System.out.println("We have a winner!");
              return false;
              }
          
          if (board [0][2]==board [1][1]) && board[1][1]==board[2][0]) && turn >5){
              System.out.println("We have a winner!");
              return false;
              }
        	 
         if (turn >=9);{
          	System.out.println("Tie game");
         	return false;
         }
         
         return true;
         }//close checkboard
          

}

//do we have to reconize winner
//do we need check occupied
//have 1,1 be the first one, not the center one