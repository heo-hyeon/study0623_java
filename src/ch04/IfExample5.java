package ch04;

public class IfExample5 {

	public static void main(String[] args) {
		
//		int	 타입 변수 2개 선언하고
//		두정수가 주어졌을때 사분면 어디에 해달되는지 출력하는 프로그램을 작성하시오.
		
		int a = 3 ;
		int b = 6 ;
		
		if (a > 0 && b >0 ) {
			System.out.println("1사분면");
		} else if (a < 0 && b > 0 ) {
			System.out.println("2사분면");
		} else if (a < 0 && b < 0) {
			System.out.println("3사분면");
		} else {
			System.out.println("4사분면");
		}
	}
}
