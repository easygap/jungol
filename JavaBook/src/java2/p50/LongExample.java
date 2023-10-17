package java2.p50;

public class LongExample {

	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];
		
		System.out.println(mathScores.length);
		System.out.println(mathScores[0].length);
		
		for(int i = 0; i< mathScores.length; i++) {
			for(int j=0; j < mathScores[i].length; j++) {
				System.out.println("mathScores[" + i + "][" + j + "] = " + mathScores[i][j]);
			}
		}
		
		mathScores[1][0] = 80;
		mathScores[1][2] = 99;
		
		for(int i = 0; i< mathScores.length; i++) {
			for(int j=0; j < mathScores[i].length; j++) {
				System.out.println("mathScores[" + i + "][" + j + "] = " + mathScores[i][j]);
			}
		}
	}
}