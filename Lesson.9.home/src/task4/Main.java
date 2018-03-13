package task4;

import java.util.ArrayDeque;

public class Main {

	public static void main(String[] args) {

		ArrayDeque<String> deque = new ArrayDeque<>();
		deque.add("Sheldon");
		deque.add("Leonard");
		deque.add("Volovitc");
		deque.add("Kutrapalli");
		deque.add("Penny");

		// bad call
		try {
			ArrayService.drinkGlassCola(null, 210);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// bad call
		try {
			ArrayService.drinkGlassCola(deque, -1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// good call as book
		try {
			ArrayService.drinkGlassCola(deque, 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// good call
		try {
			ArrayService.drinkGlassCola(deque, 210);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
