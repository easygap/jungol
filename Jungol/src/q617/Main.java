package q617;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Name[] name = new Name[5];
		Height[] height = new Height[5];

		for (int i = 0; i < name.length; i++) {
			name[i] = new Name(sc.next());
			height[i] = new Height(sc.nextInt());
		}
		sc.close();

		int min = 999;
		int number = 0;

		for (int i = 0; i < height.length; i++) {
			if (height[i].setHeight() < min) {
				min = height[i].setHeight();
				number = i;
			}
		}

		System.out.printf("%s %d", name[number].setName(), min);

	}
}

class Name {
	private String name;

	public Name(String name) {
		this.name = name;
	}

	public String setName() {
		return name;
	}
}

class Height {
	private int height;

	public Height(int height) {
		this.height = height;
	}

	public int setHeight() {
		return height;
	}
}