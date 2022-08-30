package CodingTest;

public class August30 {

	public static void main(String[] args) {
		
//		1. 구구단 2~9단 프로그램 작성하시오, 10줄 이하로!
	
		for (int i=2; i<=9; i++ ) {        //2~9단이니까 2부터 시작!
			for (int j=1; j<=9; j++) {	   //곱하는 수니까 1부터 9까지
				System.out.println(i + "*" + j + " : " + (i*j));
			}
		}
	


 			

//		2. int 타입의 변수를 2개 선언하고 두 정수가 주어졌을 때 두 정수를 비교하고 
//		크기 비교 결과를 나타내는 프로그램을 작성하시오.

		int num1 = 20;
		int num2 = 30;
		
		if (num1 > num2 ) {
			System.out.println("num1이 num2보다 크다");
		} else if (num2 > num1 ) {
			System.out.println("num2가 num1보다 크다");
		} else {
			System.out.println("num1과 num2가 같다");
		}
		
		
		
//		3. int 타입 변수를 2개 선언하고
// 		두 정수가 주어졌을 때 사분면 어디에 해당되는지 출력하는 프로그램 작성
		
		int a = -7;
		int b = 3;
		
		if (a>0 && b>0)  {
			System.out.println("1사분면입니다.");
		} else if (a>0 && b<0) {
			System.out.println("2사분면입니다.");
		} else if (a<0 && b>0) {
			System.out.println("3사분면입니다.");
		} else {
			System.out.println("4사분면입니다.");
		}
	}
}

