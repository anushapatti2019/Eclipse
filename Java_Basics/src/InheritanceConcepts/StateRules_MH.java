package InheritanceConcepts;

public class StateRules_MH extends CentralRules{
	
	public static void main(String[] args) {
		StateRules_MH sr = new StateRules_MH();
		sr.cityplan();
		sr.landplan();
		sr.waterplan();
		System.out.println(name);
	}
	
	public void cityplan() {
		System.out.println("cityplan");
	}

}
