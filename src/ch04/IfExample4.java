package ch04;

public class IfExample4 {

	public static void main(String[] args) {
		
//		int 타입의 변수를 1개 선언 / 짝수인지 홀수인지 출력(나누기보다는 몫 계산으로)

		int x = 5 ;
			
		if (x % 2 == 0)  {
			System.out.println("짝수입니다.");
		} else if (x % 2 != 0) {
			System.out.println("홀수입니다.");
		} else {
		// a==0
			System.out.println("0입니");
		}
	}
}
