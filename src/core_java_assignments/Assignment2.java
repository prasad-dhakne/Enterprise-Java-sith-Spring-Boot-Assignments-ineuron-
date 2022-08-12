package core_java_assignments;

import java.util.*;

public class Assignment2 {
	public static void main(String[] args) {
		char ch;
		do {
			Umpire u = new  Umpire();
			u.collectNumFromGuesser();
			u.collectNumsFromPlayers();
			u.declareWinner();
			Scanner sc = new Scanner(System.in);
			System.out.println("Do you want to play again? If yes enter 'Y/y' else enter any character");
			ch = sc.next().charAt(0);
		}while(ch == 'Y' || ch == 'y');
		System.out.println("Thanks, See you again!");
	}
}

class Umpire{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	public void collectNumFromGuesser() {
		Guesser ges = new Guesser();
		numFromGuesser = ges.guessNumber();
	}
	
	public void collectNumsFromPlayers() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		numFromPlayer1 = p1.guessNumber();
		numFromPlayer2 = p2.guessNumber();
		numFromPlayer3 = p3.guessNumber();
	}
	
	public void declareWinner() {
		if(numFromGuesser == numFromPlayer1 &&
		   numFromGuesser == numFromPlayer2 &&
		   numFromGuesser == numFromPlayer3) {
			System.out.println("Game tied, All players guessed correctly !");
		}
		else if(numFromGuesser == numFromPlayer1 &&
				numFromGuesser == numFromPlayer2) {
			System.out.println("Player 1 and Player 2 won the game!");
		}
		else if(numFromGuesser == numFromPlayer1 &&
				numFromGuesser == numFromPlayer3) {
			System.out.println("Player 1 and Player 3 won the game!");
		}
		else if(numFromGuesser == numFromPlayer2 &&
				numFromGuesser == numFromPlayer3) {
			System.out.println("Player 2 and Player 3 won the game!");
		}
		else if(numFromGuesser == numFromPlayer1) {
			System.out.println("Player 1 won the game!");
		}
		else if(numFromGuesser == numFromPlayer2) {
			System.out.println("Player 2 won the game!");
		}
		else if(numFromGuesser == numFromPlayer3) {
			System.out.println("Player 3 won the game!");
		}
		else {
			System.out.println("Game Lost, Please Try Again");
		}
	}
	
}

class Guesser{
	public int guessNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser, Please guess the number");
		return sc.nextInt();
	}
}

class Player{
	public int guessNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey Player, Please guess the number");
		return sc.nextInt();
	}
}