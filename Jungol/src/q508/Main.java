package q508;

public class Main {

	public static void main(String[] args) {
		/*
		String a = "item";
		String b = "count";
		String c = "price";
		String d = "pen";
		int e = 20;
		int f = 100;
		String g = "note";
		int h = 5;
		int i = 95;
		String j = "eraser";
		int k = 110;
		int l = 97;
		System.out.printf("%10s%10s%10s\n",a,b,c);
		System.out.printf("%10s%10d%10d\n",d,e,f);
		System.out.printf("%10s%10d%10d\n", g, h, i);
		System.out.printf("%10s%10d%10d", j, k, l);
		*/
		
		String[] ar = {"item", "count", "price", "pen", "20", "100", "note", "5", "95", "eraser", "110", "97"};

		for(int i=0; i<ar.length;i++) {
			if(i%3==0 && i !=0) {
				System.out.println();
			//	System.out.printf("\n");
			}
			System.out.printf("%10s",ar[i]);
			
			/*
			System.out.printf("%10s%10s%10s\n",ar[0],ar[1],ar[2]);
			System.out.printf("%10s%10s%10s\n",ar[3],ar[4],ar[5]);
			System.out.printf("%10s%10s%10s\n",ar[6],ar[7],ar[8]);
			System.out.printf("%10s%10s%10s",ar[9],ar[10],ar[11]);
			*/
		}
	}
}