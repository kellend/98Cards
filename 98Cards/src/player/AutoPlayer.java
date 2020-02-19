package player;

import java.util.ArrayList;

import cards.PilePool;

public class AutoPlayer {
	
	//These are hand indexes
	private static int smallestPlayableAsc;
	private static int largestPlayableDesc;
	
	
	private static ArrayList<Integer> placedCards = new ArrayList<Integer>();

	
	public static String move() {
		// First play the furthest from 50
		// Keep two stacks "pure"
		// Prefer to play whatever changes the least
		// Prefer to play 10's
		// Always try to place on unpure stacks before resorting to pure stacks
		// Last resort just plays whatever is possible in sequential order
		
		// Assign weighted score of what moves are best?
		
		// 0a and 2d are dirty piles (lol)
		// 1a and 3d are pure
		
		// Remember, -1 is undefined
		int[] pileVals = PilePool.getPileValues();
		
		// Opening move
		if (pileVals[0] == -1 &&
				pileVals[1] == -1 &&
				pileVals[2] == -1 &&
				pileVals[3] == -1) {
			
		}
		
		return null;
	}
	
}
