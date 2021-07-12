package assignment7;

import java.security.SecureRandom;
import java.util.Scanner;

public class ArcheryGame {
	public static void main(String[] args) {
		
		SecureRandom randomNumber = new SecureRandom();
		Scanner input = new Scanner(System.in);
		int[][] arr = {{1, 0, 0, 0, 0}, {2, 0, 0, 0, 0}, {3, 0, 0, 0, 0}, {4, 0, 0, 0, 0}};
		int win = arr[0][4];
		int winplayer = 0;
		
		for(int random = 0; random < arr.length; random++) {
			int first = randomNumber.nextInt(10) + 1;
			int second = randomNumber.nextInt(10) + 1;
			int third = randomNumber.nextInt(10) + 1;
			
			int total = first + second + third;
			
			arr[random][1] = first;
			arr[random][2] = second;
			arr[random][3] = third;	
			arr[random][4] = total;
		}
		
		
		System.out.printf("##### ARCHERY GAME #####%n%n");
		
		System.out.printf("%7s%9s%9s%9s%9s%n", "", "SCORE1", "SCORE2", "SCORE3", "TOTAL");
		
		for(int row = 0; row < arr.length; row++) {
			System.out.printf("PLAYER%d%9d%9d%9d%9d%n", arr[row][0], arr[row][1], arr[row][2], arr[row][3], arr[row][4]);
		}

		for(int com = 0; com < arr.length; com++) {
			if(win < arr[com][4]) {
				win = arr[com][4];
				winplayer = arr[com][0];
			}
		}
		
		System.out.printf("%nTHE WINNER IS PLAYER%d", winplayer);
		
	}
}