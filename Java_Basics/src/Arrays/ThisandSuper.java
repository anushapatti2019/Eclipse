package Arrays;

public class ThisandSuper extends minrow_maxcol {
	
	int a=3;
	public void getdata() {
		
		int a=2;					
		System.out.println(a);			//calling local variable of method
		System.out.println(this.a);		// calling global variable of same class
		System.out.println(super.a); //calling global variable of parent class
	}
	
	public static void main(String[] args) {
		ThisandSuper ts= new ThisandSuper();
		ts.getdata();
	}

}
