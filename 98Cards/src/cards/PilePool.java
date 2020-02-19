package cards;

public class PilePool {
	
	private static Pile[] piles;
	
	public static void init() {
		
		piles = new Pile[] {
				new Pile(1),
				new Pile(1),
				new Pile(-1),
				new Pile(-1)
		};
		
	}
	
	public static boolean add(int index, Card c) {
		return piles[index].add(c);
	}
	
	public static Pile[] getPiles() {
		return piles;
	}
	
	public static int[] getPileValues() {
		return new int[] {
			piles[0].getValue(),
			piles[1].getValue(),
			piles[2].getValue(),
			piles[3].getValue(),
		};
	}
	
	public static String[] getPileStrings() {
		return new String[] {
			piles[0].getString(),
			piles[1].getString(),
			piles[2].getString(),
			piles[3].getString(),
		};
	}

}
