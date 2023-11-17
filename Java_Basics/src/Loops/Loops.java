package Loops;

public class Loops {
	public static void main(String[] args) {

		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		System.out.println();
		
		int val=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((3*val)+"\t");
				val++;
			}
			System.out.println();
		}
	}

}
