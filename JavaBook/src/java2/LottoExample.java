package java2;

import java.util.*;

public class LottoExample {

	public static void main(String[] args) {	
		int num[] = new int[6];
		List<Integer> list = new ArrayList<>();
		Random r = new Random();
		
		for(int i = 0; i < 6; i++) {
			num[i] = r.nextInt(45) + 1;
			for(int j=0; j<i; j++) {
				if(num[i] == num[j]) {
					i--;
				}
			}
		}
		
		for (int value : num) {
			list.add(value);
		}
		
		Collections.sort(list);
		System.out.println(list);
	}
}