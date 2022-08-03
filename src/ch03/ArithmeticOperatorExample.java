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
		int result8 = a+b+c ;
		System.out.println("result8:" + result8);
		
		sum(8,7,5);
		sum(1,9,5);
		sum(5,6,6);
		sum(4,7,1);
		sum(7,5,5);
		
		
		
	  int t1 = 60; int t2 = 70; int t3 = 85; int t4 = 90; int t5 = 45; 
	  int result10 = t1 + t2 + t3 + t4 +t5 ; 
	  int result11 = result10 / 5 ;
	  System.out.println("평균:" + result11);
		 
		
		avg ("홍길동",60,70,85,90,45);
		avg ("박말순",50,75,70,60,70);
		avg ("고장난",55,60,64,58,90);
		avg ("도롱뇽",80,70,63,80,70);
		}
	
	
		public static void avg (String name, int english, int math, int phtsics, int music, int athletic) {
			System.out.println(name + "평균:"+(double)(english+math+phtsics+music+athletic)/5);
		}
		
		
		
		//위치도 잘 알아둘것! //
		public static void sum (int a, int b, int c) {
			System.out.println(a + "+" + b + "+" + c + "="+(a+b+c));
		}
}
