package display;

import java.util.Scanner;

import player.AutoPlayer;

public class Input {
	
	public static Scanner s = new Scanner(System.in);
	public static boolean autoPlay = false;
	
	public static String getInput() {
		if (!autoPlay) {
			System.out.print("Input\t>");
			String in = s.nextLine();
			return in;
		} else {
			return AutoPlayer.move();
		}
	}
	
	public static void toggleAutoPlay() {
		if (autoPlay) autoPlay = false;
		else autoPlay = true;
	}

}
