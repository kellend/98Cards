package main;

import java.util.ArrayList;

import cards.Card;
import cards.CardPool;
import cards.Hand;
import cards.Pile;
import cards.PilePool;
import display.Display;
import display.Input;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		restart();
		
		while (validMoveAvailable()) {
			Display.clear();
			Display.printRemainingCards();
			Display.printPiles();
			Display.printHand();
			String move = Input.getInput();
			if (!parse(move))
				Display.printInvalidMove();
			
			if (Hand.getHandSize() < 7) Hand.fillHand();
		}
		
		if (CardPool.isEmpty()) Display.printWin();
		else Display.printLose();
	}
	
	private static boolean parse(String s) {
		s = s.toLowerCase();
		s.replace(" ", "");
		
		if (s.startsWith("x")) endGame();
		if (s.startsWith("r")) {
			restart();
			return true;
		}
		
		if (s.length() < 2) return false;
		
		int handIndex;
		
		char c = s.charAt(0);
		
		switch (c) {
		case 'a':
			handIndex = 0;
			break;
			
		case 'b':
			handIndex = 1;
			break;
			
		case 'c':
			handIndex = 2;
			break;
			
		case 'd':
			handIndex = 3;
			break;
			
		case 'e':
			handIndex = 4;
			break;
			
		case 'f':
			handIndex = 5;
			break;
			
		case 'g':
			handIndex = 6;
			break;
			
		case 'h':
			handIndex = 7;
			break;
			
			default: return false;
		}
		
		int pileIndex;
		
		try {
			pileIndex = Integer.parseInt("" + s.charAt(1));
			pileIndex--;
		} catch(NumberFormatException ex) {
			return false;
		}
		
		if (pileIndex < 0 || pileIndex > 3) return false;
		
		return makeMove(handIndex, pileIndex);
	}
	
	private static void restart() {
		CardPool.createNewRandPool();
		PilePool.init();
		Hand.clear();
		Hand.fillHand();
	}

	private static void endGame() {
		Display.printLose();
		System.exit(0);
	}

	private static boolean makeMove(int handIndex, int pileIndex) {
		Card c = Hand.remove(handIndex);
		if (c == null) return false;
		
		if (PilePool.add(pileIndex, c)) return true;
		
		Hand.returnCard(c, handIndex);
		
		return false;
		
		
	}

	private static boolean validateGameState() {
		if (!validMoveAvailable()) return false;
		
		return true;
	}

	private static boolean validMoveAvailable() {
		Card[] h = Hand.getHand();
		Pile[] piles = PilePool.getPiles();
		
		for (Card c : h) {
			for (Pile p : piles) {
				if (c != null) {
					if (p.validate(c)) return true;
				}
			}
		}
		
		return false;
	}

}
