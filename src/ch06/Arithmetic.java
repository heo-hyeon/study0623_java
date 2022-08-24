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
	
	public int abc (int a) {
		return 1;
	}
	
	public String num (int a) {
		return "";
	}
	
	public boolean bbb(int a) {
		return true;
	}
	
	public double ccc (int a) {
		return 1.1;
	}
	
	public void ddd (int a) {
		
	}
	
	static void staticTest () {
		System.out.println("나는 뭐뭐다");
	}
}

