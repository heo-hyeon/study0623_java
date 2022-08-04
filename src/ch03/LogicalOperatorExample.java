package ch03;

public class LogicalOperatorExample {

	public static void main(String[] args) {

//	&& = & : and : 논리곱 : 연산 참 참 참, 나머지 폴스
//  || = | : or : 논리합 : 연산 참 폴스 참, 폴스 참 참, 참 참 참, 폴스 폴스 폴스
//  ^ : 배타적 논리합 : 참 참 폴스, 폴스 폴스 폴스, 참 폴스 참, 폴스 참 참		
		
		
		int a = 65;
		
		
		boolean result1 = ( a>= 65);
		System.out.println("result1:" + result1);
		
		boolean result2 = ( a<= 65);
		System.out.println("result2:" + result2);
		
		
		if (a >= 65 & a <= 90) {
			System.out.println("65보다 크거나 같고 90보다 작습니다");
		}
		
		if (a >= 65 && a <= 90) {
			System.out.println("65보다 크거나 같고 90보다 작습니다");
		}
		
		if (a >= 65 | a <=90) {
			System.out.println("둘다참");
		}
		
		if (a >= 66 | a <=90) {
			System.out.println("하나만 참");
		}
		
		if (a >= 66 | a <=30) {
			System.out.println("둘다폴스라서 결과 안 보인다");
		}
		
		if (a >= 65 || a <=90) {
			System.out.println("둘다참");
		}
		
		if (a >= 66 || a <=90) {
			System.out.println("하나만 참");
		}
		
		if (a >= 66 || a <=30) {
			System.out.println("둘다폴스라서 결과 안 보인다");
		}
		
		if (a >= 65 ^ a <=50) {
			System.out.println("하나만 참 or 폴스여서 보여진다");
		}
		
		if (a >= 65 ^ a <=90) {
			System.out.println("둘다 참이여서 안 보인다");
		}
		
		if (a >= 90 ^ a <=30) {
			System.out.println("둘다 폴스여서 안 보인다");
		}

	}
}