package java4.p51;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] scores = { 99, 68, 36, 29, 88 };

		Arrays.sort(scores);
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "]=" + scores[i]);
		}

		int index = Arrays.binarySearch(scores, 99);	// 정렬이 되어 있어야 이진 탐색이 가능하다.
		System.out.println("index : " + index);
	}
}