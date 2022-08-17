package ch04;

public class IfExample3 {

	public static void main(String[] args) {
		// int 타입의 변수를 2개 선정하고 
		// 두 정수가 주어졌을때 두 정수를 비교하여
		// 크기 비교 결과를 나타내는 프로그램을 작성하시오.
		
		int num1 = 90;
		int num2 = 100;
		
		if (num1 > num2 ) {
			System.out.println("num1이 num2보다 크다");
		} else if (num1 < num2 ) {
			System.out.println("num2가 num1보다 크다");
		} else {
			System.out.println("num1과 num2가 같다.");
		};
	}
}
