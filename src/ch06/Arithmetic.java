package ch06;

public class Arithmetic {

	public int add (int a, int b) {
		return a+b ;
	}
	
	public int minus (int a, int b) {
		return a-b ;
	}
	
	public int multi (int a, int b) {
		return a*b ;
	}
	
	public int divid (int a, int b) {
		return a / b ;
	}
	
	public int remind (int a, int b) {
		return a % b ;
	}
	
	public void say (int result) {
		System.out.println("값은" +  result +"입니다");
	}	
}
