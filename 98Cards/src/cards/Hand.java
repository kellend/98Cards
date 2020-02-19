package cards;

import java.util.ArrayList;

public class Hand {
	
	public static final int HAND_SIZE = 8;
	private static Card[] hand = new Card[HAND_SIZE];
	
	public static void fillHand() {
		for (int i = 0; i < hand.length; i++) {
			Card c = hand[i];
			if (c == null) hand[i] = CardPool.removeCard();
		}
	}
	
	public static Card remove(int index) {
		Card c = hand[index];
		hand[index] = null;
		return c;
	}
	
	public static int getHandSize() {
		int l = 0;
		for (int i = 0; i < hand.length; i++) {
			if (hand[i] != null) l++;
		}
		return l;
	}
	
	public static Card[] getHand() {
		return hand;
	}

	public static void returnCard(Card c, int handIndex) {
		hand[handIndex] = c;
	}

	public static void clear() {
		hand = new Card[HAND_SIZE];
	}

}
