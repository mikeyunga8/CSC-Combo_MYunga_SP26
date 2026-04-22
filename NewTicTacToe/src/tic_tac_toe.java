import java.util.Arrays;
import java.util.Scanner;

/**************************************************
 * This is a Tic Tac Toe game created with code. * It will need a player
 * variable and a board * The player variable will be an int that * alternates
 * between 1 and 2 * * the board will be an array of chars
 * 
 * @author S03121072 *
 * @since 4/22/26 * *
 **************************************************/
public class tic_tac_toe {

	/**
	 * This is the main method
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		int player = 2;
		char[][] board = new char[3][3];
		fillBoard(board);
		drawBoard(board);
		int count = 0;
		while (count < 9 && checkWinner(board, player) < 1) {
			player = player % 2 + 1;
			makeMove(board, player);
			drawBoard(board);

			count++;
		}
		if (checkWinner(board, player) > 0) {
			System.out.println("Player " + player + " is the winner!!!");
		} else
			System.out.println("Cat's Game!!");
	}

	/**
	 * This takes in the board and the current player and checks to see 
	 * if there is a winning combination if there is a win condition it returns the player otherwise it returns -1
	 * @param board 2d array of chars to represent a tic tac toe board 
	 * @param player the current player
	 * @return
	 */
	private static int checkWinner(char[][] board, int player) {
		String line = null;
		for (int i = 0; i < 8; i++) {
			switch (i) {
			case 0: //top horiz
				line = String.valueOf(board[0][1]) + board[0][1] + board[0][2];
				break;
				
			case 1: //mid horiz
				line = String.valueOf(board[1][0]) + board[1][1] + board[1][2];
				break;
				
			case 2: //bottom horiz
				line = String.valueOf(board[2][0]) + board[2][1] + board[2][2];
				break;
				
			case 3: //left vrt
				line = String.valueOf(board[0][0]) + board[1][0] + board[2][0];
				break;

			case 4:	//mid vert
				line = String.valueOf(board[1][1]) + board[1][2] + board[1][3];
				break;

			case 5: // right vert
				line = String.valueOf(board[0][2]) + board[1][2] + board[2][2];
				break;

			case 6: // 
				line = String.valueOf(board[0][]) + board[4][] + board[][];
				break;

			case 7:
				line = String.valueOf(board[]][]) + board[][] + board[][];
				break;
			}
			if (line.equals("XXX") || line.equals("OOO"))
				return player;

		}
		return -1;
	}

	/**
	 * Takes board and current player to make a move on the board, 
	 * making sure the spot they are playing in is taken or not, if there is, they have to make another move
	 * 
	 * @param board 2d array of chars to represent a tic tac toe board 
	 * @param player current player
	 */
	private static void makeMove(char[][] board, int player) {
		Scanner input = new Scanner(System.in);
		int row = -1;
		int col = -1;
		char marker = 'X';
		if (player == 2) {
			marker = 'O';
		}
		while (true) {
			System.out.println("Player " + player + ", enter a position (1-9): ");
			if (input.hasNextInt()) {
				int place = input.nextInt();
				if (place >= 1 && place <= 9) {
					// The "Magic" Math
					row = (place - 1) / 3;
					col = (place - 1) % 3;

					// Check if the spot is available
					if (Character.isDigit(board[row][col])) {
						board[row][col] = marker;
						break;
					} else {
						System.out.println("That spot is already taken!");
					}
				} else {
					System.out.println("Invalid range. Please pick 1-9");
				}
			} else {
				System.out.println("Please enter a number.");
				input.next(); // clear invalid input
			}
		}
	}

	/**
	 * Draws board using ASCII
	 * @param board 2d array of chars to represent a tic tac toe board 
	 */
	private static void drawBoard(char[][] board) {
		for (int i = 0; i < 3; i++) { // rows
			for (int j = 0; j < 3; j++) { // columns
				System.out.print(board[i][j]);
				if (j != 2)
					System.out.print('|');
			}
			System.out.println();
			if (i != 2)
				System.out.println("~~~~~");
		}
	}

	/**
	 * This fills the array with chars from '1' to '9'
	 * @param board 2d array of chars to represent a tic tac toe board 
	 */
	private static void fillBoard(char[][] board) {
		int index = 0;
		char ch = '1';
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = ch;
				ch++;
				index++;

			}
		}

	}

}