import java.util.Scanner;

public class ttt {

	/**
	 * this is the main method of the program, calling all other classes in the
	 * main ] also record player turn, turn
	 */

	public static void main(String[] args) {
		String[][] board = new String[3][3];
		boolean player1 = true;
		System.out.println("shall we play a game?");
		int turn = 0;

		while (checkBoard(board, turn)) {
			printBoard(board, turn);
			board = tic(board, player1);
			player1 = !player1;
			turn++;
		}

	}// close main

	/** initializing board, print 2d 3x3 array */

	public static void printBoard(String[][] board, int turn) {
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 3; i++) {
				if (board[i][j] == null) {
					System.out.print("[ - ]");
				} else {
					System.out.print("[" + board[i][j] + "]");
				}

			}// close first loop
			System.out.print("\n");
		}// close 2nd loop
		System.out.print("\n");
	}

	/**
	 * this is to record the user input and convert it as a "x" or "o" on the array*/

	public static String[][] tic(String[][] board, boolean player1) {
		Scanner in = new Scanner(System.in); // store the x coordinate
		while (true) {
			System.out.println("Please enter your desired X coordinate from 1-3");
			int i = in.nextInt()-1;
			System.out.println("Please enter your desired Y coordinate from 1-3");
			int j = in.nextInt()-1;
			
			if (board[i][j]==" x "||board[i][j]=="o"){
				System.out.println("please reenter an unoccupied spot");
			}
			
			else{
				if ((i >= 0 || i <= 2)) {
					if (player1) {
						board[i][j] = " x ";
						return board;
					} else {
						board[i][j] = " o ";
						return board;
					}
				}
			}
			System.out.println("Error in your input");
		}
	}
	


	/**
	 * check winner, include five conditions: from top to bottom, left to right,
	 * two kind of a diagonal, and tie game boolean, if not winning, return true
	 * so the program will keep going otherwise terminate the game
	 */

	public static boolean checkBoard(String[][] board, int turn) {
		
		String player="";
		if (turn%2==0) { player="2";}
		else{ player="1";}
		
		for (int i = 0; i < 3; i++) {
			if (board[i][0] == board[i][1] && board[i][1] == board[i][2]
					&& turn >= 5) {
				System.out.println("We have a winner!: player" + player );
				return false;
			}
		}

		for (int j = 0; j < 3; j++) {
			if (board[0][j] == board[1][j] && board[1][j] == board[2][j]
					&& turn >= 5) {
				System.out.println("We have a winner!: player" + player );
				return false;
			}
		}

		if (board[0][0] == board[1][1] && board[1][1] == board[2][2]
				&& turn >= 5) {
			System.out.println("We have a winner!: player" + player );
			return false;
		} 
		
		else if (board[0][2] == board[1][1] && board[1][1] == board[2][0]
				&& turn >= 5) {
			System.out.println("We have a winner!: player" + player );
			return false;
		}

		else if (turn >= 9) {
			System.out.println("Tie game");
			return false;
		}
		
		else {
			return true;
		}

	}// close checkboard

}
