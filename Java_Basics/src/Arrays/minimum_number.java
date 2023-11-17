package Arrays;

public class minimum_number {

	public static void main(String[] args) {
		int a[][]= {{3,6,2},{8,2,5},{8,2,9}};
		 int min=a[0][0];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
				if(a[i][j]<min) {
					min=a[i][j];
				}
			}
		}
		System.out.println(min);

	}

}
