package q561;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[10];
		int max = 0;
		int min = 10000;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 100 && max < arr[i])
				max = arr[i];
			else if (i == arr.length - 1 && max == 0)
				max = 100;
			if (arr[i] > 100 && min > arr[i])
				min = arr[i];
			else if (i == arr.length - 1 && min == 10000)
				min = 100;
		}
		System.out.printf("%d %d ", max, min);
		sc.close();
	}
}