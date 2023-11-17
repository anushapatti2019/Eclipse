package CoreJava;

public class StaticandNonstatic {
	
	String name; //instance or global variables
	String city;
	static String address="MH"; //static or class variables
	
	StaticandNonstatic(String name,String city){
		
		this.name=name; //local variables	
		this.city=city;
		
	}
	
	public void getdata() {	//non-static method
		System.out.println(address);
	}
	
	public static void getdata1() { //static method
		System.out.println(address);
	}
	public static void main(String[] args) {
		
		StaticandNonstatic sn=new StaticandNonstatic("Anu","Pune");
		System.out.println(sn.name);
		System.out.println(sn.address);	//calling non-static variable with object
		sn.getdata();					//calling static variable with object	
		sn.getdata1();					//calling static method with object
		StaticandNonstatic.getdata1(); //calling static method with class name
		//StaticandNonstatic.getdata();	// calling non-static method with class name not allowed

	}

}
