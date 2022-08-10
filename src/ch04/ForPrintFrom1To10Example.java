package ch04;

public class ForPrintFrom1To10Example {

	public static void main(String[] args) {

//1부터 10까지 더하는 프로그램 작성 
		
// int는 a대신 i 설정,0말고 1부터 시작, 한번 실행 후 ++처리, i값 조회 후 sum

		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			sum = sum + i ; // sum += i ;
		}
			System.out.println("sum:" + sum);
			
		double min = 10;
		double max = 100;
		double random = (int) ((Math.random() * (max- min)) + min);
		System.out.println(random);
	}

}
