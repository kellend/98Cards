package cards;

public class Pile {
	
	private Card c;
	private int direction; // -1 for descending, 1 for ascending
	
	public Pile(int direction) {
		this.direction = direction;
	}
	
	public boolean add(Card c) {
		
		if (validate(c)) {
			this.c = c;
			return true;
		}
		
		return false;
	}
	
	public boolean validate(Card c) {
		if (this.c == null) return true;
		// If the card is in the proper direction, add it
		if (this.c.getValue() * direction < c.getValue() * direction) {
			return true;
		}
		
		// If the card is in the reverse direction but has a difference of 10, add it
		if ((this.c.getValue() * direction) - (c.getValue() * direction) == 10) {
			return true;
		}
		
		return false;
	}
	
	public int getValue() {
		if (c == null) return -1;
		return c.getValue();
	}
	
	public String getString() {
		if (c == null) return "-";
		return c.getValue() + "";
	}
	
	public int getDirection() {
		return direction;
	}

}
