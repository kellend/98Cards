package cards;

import java.util.ArrayList;
import java.util.Random;

public class CardPool {
	
	private static ArrayList<Card> pool = new ArrayList<Card>();
	
	public static void createNewRandPool() {
		pool.clear();
		
		for (int i = 2; i <= 99; i++) {
			pool.add(new Card(i));
		}
		
		pool = randomize(pool);
	}
	
	public static Card removeCard() {
		if (pool.isEmpty()) return null;
		return pool.remove(0);
	}
	
	public static boolean isEmpty() {
		return pool.isEmpty();
	}
	
	
	private static ArrayList<Card> randomize(ArrayList<Card> al) {
		
		Random r = new Random();
		ArrayList<Card> ral = new ArrayList<Card>();
		
		while (al.size() > 0) {
			int ri = r.nextInt(al.size());
			ral.add(al.get(ri));
			al.remove(ri);
		}
		
		return ral;
	}

	public static int size() {
		return pool.size();
	}
	
}
