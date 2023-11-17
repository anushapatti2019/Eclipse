package Loops;

public class pyramid_triangle {

	public static void main(String[] args) {
		int j = 1;
		int c = 1;
		for (int i = 0; i < 4; i++) {

			for (j = 4-i; j > 0; j--) {
				System.out.print(c+"\t");
				c++;
			}
			System.out.println();
		}
		
		System.out.println();
		
		int val=1;
		for(int m=1;m<=4;m++) {
			
			for(int n=4;n>4-m;n--) {
				System.out.print(val+"\t");
				val++;
			}
			System.out.println();
		}
	}

}
