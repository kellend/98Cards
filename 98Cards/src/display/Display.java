package display;

import java.util.ArrayList;

import cards.Card;
import cards.CardPool;
import cards.Hand;
import cards.PilePool;

public class Display {
	
	
	public static void printHand() {
		Card[] h = Hand.getHand();
		
		System.out.println("Your Hand:");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for (int i = 0; i < 8; i++) {
			Card c = h[i];
			String s;
			if (c == null) s = "-";
			else s = "" + c.getValue();
			System.out.print("| " + s + " |   ");
		}
		
		System.out.println();
		
		System.out.println(
				  "  a     "
				+ "   b     "
				+ "   c     "
				+ "   d     "
				+ "   e     "
				+ "   f     "
				+ "   g     "
				+ "   h     ");
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
	}
	
	public static void printPiles() {
		String[] v = PilePool.getPileStrings();
		
		System.out.println(
				  "^| " + v[0] + " |\t\t"
				+ "^| " + v[1] + " |\t\t"
				+ "v| " + v[2] + " |\t\t"
				+ "v| " + v[3] + " |\t\t");
		System.out.println(
				  "   1\t\t"
				+ "   2\t\t"
				+ "   3\t\t"
				+ "   4\t\t\n\n");
	}
	
	public static void printRemainingCards() {
		System.out.println((CardPool.size() + Hand.getHandSize()) + " cards remaining.");
	}
	
	public static void printWin() {
		System.out.println("\n" +
				  "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
				+ "WOWOWOWOW YOU DID IT YOU WONDERFUL BASTARD :)\n"
				+ "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
	public static void printRestart() {
		System.out.println("\n\nPlay again?"
				+ "\n\n\tY\t\tN");
	}
	
	public static void clear() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n");
	}

	public static void printLose() {
		System.out.println("\n" +
				  "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
				+ "                   LOSER >:(\n"
				+ "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
				+ "\n" + CardPool.size() + " cards remaining.");
	}

	public static void printInvalidMove() {
		System.err.println("Invalid move");
	}

}
