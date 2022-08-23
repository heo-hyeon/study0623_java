package ch06;

public class ArithmeticExample {


	public static void main(String[] args) {
			
		Arithmetic arithmetic = new Arithmetic ();
		
		int resultAdd = arithmetic.add(1, 3);
		int resultMinus = arithmetic.minus(1,3);
		int resultMulti = arithmetic.multi(1,3);
		int resultDivid = arithmetic.divid(1,3);
		int resultremind = arithmetic.remind(1,3);
		
		arithmetic.say(resultAdd);
		arithmetic.say(resultMinus);
		arithmetic.say(resultMulti);
		arithmetic.say(resultDivid);
		arithmetic.say(resultremind);
	}
}
