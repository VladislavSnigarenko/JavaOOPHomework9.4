package task4;

import java.util.ArrayDeque;

import javax.management.Query;

public class ArrayService {

	public static void drinkGlassCola(ArrayDeque<String> deque, int countGlass) {
		if (countGlass <= 0 || deque == null) {
			throw new IllegalArgumentException("Bad arguments");
		}

		for (int i = 0; i < countGlass; i++) {
			deque.addLast(deque.getFirst());
			deque.addLast(deque.getFirst());
			deque.removeFirst();
		}

		printArrayDeque(deque, countGlass);

	}

	private static void printArrayDeque(ArrayDeque<String> deque, int countGlass) {
		System.out.println();
		System.out.println("Drink : " + countGlass + " glass COLA !");
		int i = 0;
		for (String str : deque) {
			System.out.println("(" + i + " / " + deque.size() + ") : " + str);
			i++;
		}
	}

}
