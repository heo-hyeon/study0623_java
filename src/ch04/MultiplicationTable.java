package ch04;

public class MultiplicationTable {

	public static void main(String[] args) {
		
// 구구단2단  출력 프로그램
// 2*1=2
//		for (int i=1; i<=9; i++) {
//			System.out.println("2" + "*" + i + "=" + (2*i));
//		}	
		
// 2단부터 9단까지 : 6줄이상되지않게
		
		for (int i = 2; i<=9; i++) { 
			//2단부터 9단까지를 의
			for(int j = 1; j<=9; j++) {
			//곱해지는 숫자 (1~9)
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}
	}
}


