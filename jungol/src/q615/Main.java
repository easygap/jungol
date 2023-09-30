package q615;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nameJ = sc.next();
		int korJ = sc.nextInt();
		int engJ = sc.nextInt();
		String nameS = sc.next();
		int korS = sc.nextInt();
		int engS = sc.nextInt();
		
		sc.close();
		
		Average avr = new Average();
		Average avrJ = new Average(nameJ, korJ, engJ);
		Average avrS = new Average(nameS, korS, engS);
		
		avrJ.print(nameJ, korJ, engJ);
		avrS.print(nameS, korS, engS);
		avr.sumAvg(korJ, korS, engJ, engS);
		
	}
}

class Average{
	private String name;
	private int kor;
	private int eng;
	
	public Average() {
		
	}
	
	public Average(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	public void print(String name, int kor, int eng) {
		System.out.println(name + " " + kor + " " + eng);
	}
	
	public void sumAvg(int korJ, int korS, int engJ, int engS) {
		int avrKr = (korJ + korS) / 2;
		int avrEn = (engJ + engS) / 2;
		System.out.printf("avg %d %d", avrKr, avrEn);
		
	}
}