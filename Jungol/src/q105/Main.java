package q105;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		/*
		 * System.out.println("          Seoul     10,312,545        +91,375");
		 * System.out.println("          Pusan      3,567,910         +5,868");
		 * System.out.println("        Incheon      2,758,296        +64,888");
		 * System.out.println("          Daegu      2,511,676        +17,230");
		 * System.out.print("        Gwangju      1,454,636        +29,774");
		 */

		ArrayList<String> pop = new ArrayList<>(
				Arrays.asList("Seoul", "10,312,545", "+91,375", 
						"Pusan", "3,567,910", "+5,868", 
						"Incheon", "2,758,296", "+64,888", 
						"Daegu", "2,511,676", "+17,230", 
						"Gwangju", "1,454,636", "+29,774"));

		for (int i = 0; i < pop.size(); ++i) {
			if (i % 3 == 0 && i != 0) {
				System.out.println();
			}
			System.out.printf("%15s", pop.get(i));
		}
	}
}