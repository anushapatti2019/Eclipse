package Polymorphism;

public class Overloadconcept {
	
	public void getdata(int a) {
		System.out.println(a);
	}
	public void getdata(String name) {
		System.out.println(name);
	}
	public void getdata(int a, String name) {
		System.out.println(a+name);
	}
	public static void main(String[] args) {
		Overloadconcept ol = new Overloadconcept();
		ol.getdata(5);
		ol.getdata("Anusha");
		ol.getdata(4, "anusha");
		Overridden c= new Child();
		c.getdata();
	}
	
}
