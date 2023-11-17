package Arrays;

public class minrow_maxcol {
	
	int a=5;
	public static void main(String[] args) {
		
	
	int a[][]= {{3,6,2},{8,7,5},{1,8,9}};
	
	int min=a[0][0];
	int row=0;
	
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++) {
				if(a[i][j]<min) {
					min=a[i][j];
					row=j;
				}
			}
		}
		System.out.println(min);
		
		int max=min;
		for(int i=0;i<3;i++) {
			if(a[i][row]>max) {
				max=a[i][row];
			}
		}
		System.out.println(max);
	}
	
}
