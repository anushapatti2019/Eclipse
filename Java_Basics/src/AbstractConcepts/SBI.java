package AbstractConcepts;

public class SBI extends RBI{
	public static void main(String[] args) {
		
		SBI obj = new SBI();
		obj.loan();
		obj.personalloam();
	}

	@Override
	public void personalloam() {
		System.out.println("Personal Loan");
		
	}
}
