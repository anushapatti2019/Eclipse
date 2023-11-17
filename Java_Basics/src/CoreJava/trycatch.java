package CoreJava;

public class trycatch {

	public static void main(String[] args) {
		int a=3;
		int b=0;
		
		try {
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException et) {
			System.out.println("Arthematic exection handled here");
		}
		catch(IndexOutOfBoundsException er) {
			System.out.println("Array out of boundary excetion handdled here");
		}
		catch(Exception e) {
			System.out.println("default excetion handled here");
		}
		finally {
			System.out.println("This is finally block irrespective of try catch execution");
		}
	}

}
