package ch03;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {

		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1+v2 ;
		System.out.println("result1=" + result1);
		
		int result2 = v1-v2 ;
		System.out.println("result2=" + result2);
		
		int result3 = v1*v2 ;
		System.out.println("result3=" + result3);
		
		int result4 = v1/v2 ;
		System.out.println("result4=" + result4);
		
		int result5 = v1%v2 ;
		System.out.println("result5=" + result5);
		
		
		// 나누기할때는 정수말고 실수가 나올수도있으므로 double함수를 써준다
		
		double result6 = v1 / v2 ;
		System.out.println("result6:" + result6);
		
		double result7 = (double)v1 / v2 ;
		System.out.println("result7:" + result7);
		
		//예제
		int a = 8;
		int b = 7;
		int c = 5;
		int result10 = a+b+c ;
		System.out.println("result10:" + result10);
		
		sum(8,7,5);
		sum(1,9,5);
		sum(5,6,6);
		sum(4,7,1);
		sum(7,5,5);
		}
	
	
		public static void sum (int a, int b, int c) {
			System.out.println(a + "+" + b + "+" + c + "="+(a+b+c));
		}
}
