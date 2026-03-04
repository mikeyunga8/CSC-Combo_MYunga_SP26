import java.util.Arrays;
import java.util.Scanner;

/**************************************************
 * This is a Tic Tac Toe game created with code.  *
 * It will need a player variable and a board     *
 * The player variable will be an int that        *
 * alternates between 1 and 2                     *
 *                                                *
 * the board will be an array of chars
 * @author S03121072                              *
 * @date 3/4/26                                   *
 *                                                *
 **************************************************/
public class tic_tac_toe {

	public static void main(String[] args) {
		int player = 1;
		char [] board = new char [9];
		fillBoard(board);
		drawBoard(board);
		int count = 0;
		while(count < 9) {
			makeMove(board, player);
			drawBoard(board);
			player = player % 2 + 1;
			count++;
		}
	}

	private static void makeMove(char[] board, int player) {
		Scanner input = new Scanner(System.in);
		char marker = 'X';
		if(player == 2) {
			marker = 'O';
		}
		int place = -1;
		while(place < 1 || place > 9) { //makes sure they play from 1 to 9
			System.out.println("Player " + player + " enter the number where you want to place your marker.");	
			place = input.nextInt();
		}
		while(!Character.isDigit(board[place - 1])) { // makes sure that a spot isn't used
			System.out.println("Player " + player + " enter the number where you want to place your marker.");	
			place = input.nextInt();
		}
		board[place - 1] = marker;
		
		//input.close();
	}

	private static void drawBoard(char[] board) {
		int index = 0;
		for(int i = 0; i < 3; i++) { //rows
			for(int j = 0; j < 3; j++) { //columns
				System.out.print(board[index]);
				if(j != 2) System.out.print('|');	
				index++;
			}
			System.out.println();
			if(i != 2)System.out.println("~~~~~");
		}
	}

	private static void fillBoard(char[] board) {
		int index = 0;
		for(char i = '1'; i <= '9'; i++) {
			board[index] = i;
			index++;
		}
	}

}
