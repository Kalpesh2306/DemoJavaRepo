package basicPrograms;

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double principle=100000;
		double rate=11.5;
		double time=36;
		
		double CI=principle*Math.pow(1+rate/100, time);
		System.out.println(CI);
	}

}
