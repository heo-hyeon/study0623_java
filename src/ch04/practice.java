package ch04;

public class practice {

	public static void main(String[] args) {
//		**********
//		**********
//		**********
//		**********
//		**********
//		출력하는 프로그램을 만드시요
		
		
//		**********
//		*        *
//		*        *
//		*        *
//		**********
//		출력하는 프로그램을 만드시요
		
		for(int i=1; i<=5; i++) {                          //5행을 돌린다
			for(int j=1; j<=10; j++) {                     //10열을 돌린다
				if(i>=2 && i<=4) {                         //2~4행까지를 의미
					if(j>=2 && j<=9) {                     //2~9열까지
						System.out.println(" ");           //는 비워놓는다
					} else {							   //나머지는 
						System.out.println("*");		   // *로 채운다.
					}
				} else {
					System.out.println("*");
				}
			}
			System.out.println();
		}
		
		
//		1
//		12
//		123
//		1234
//		12345
//		123456
//		1234567
//		12345678
//		123456789
//		1 3 5 7 90
//		출력하는 프로그램을 만드시요	

		for(int i=1; i<=10; i++) {
			if(i==10) {
				for(int j=1; j<=i-1; j++) {
					if(j%2 ==1) {
						System.out.println(j);
					} else {
						System.out.println(" ");
					}
				}
				System.out.println("0");
			} else {
				for(int j=1; j<=i; j++) {
					System.out.println(j);
				}
				System.out.println();
			}
		}
	}
}
