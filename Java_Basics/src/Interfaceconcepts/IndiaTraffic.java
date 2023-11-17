package Interfaceconcepts;

public class IndiaTraffic implements CentralTrafic, CenralTraficRules{
	
	public static void main(String[] args)  {
		CentralTrafic ct = new IndiaTraffic();
		ct.green();
		ct.Yellow();
		ct.red();
		
		IndiaTraffic it = new IndiaTraffic();
		it.walking();
		
		
		
		
	}
	
	//India traffic class method
	public void walking() {
		System.out.println("walking");
	}

	@Override
	public void green() {
		System.out.println("green");
		
	}

	@Override
	public void red() {
		System.out.println("red");
				
	}

	@Override
	public void Yellow() {
		System.out.println("yellow");
				
	}

	@Override
	public void crossing() {
		System.out.println("Crossing");
		
	}
}
