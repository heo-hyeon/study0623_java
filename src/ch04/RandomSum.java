package ch04;

public class RandomSum {

	public static void main(String[] args) {
	
	//  랜덤정수
	//	double min = 10;
	//	double max = 100;
	//	double random = (int) ((Math.random() * (max- min)) + min);
	//	System.out.println(random);		

// 1~100사이의 랜덤 정수 2개를 발생시켜
//  두 수 사이의 합을 구하라.
		

			double num1 = 1.0;
			double num2 = 100.0;
			
			int sum = 0, min = 0, max = 0;
			
			int random1 = (int) ((Math.random() * (max- min)) + min);
			int random2 = (int) ((Math.random() * (max- min)) + min);
			
			if (random1 < random2) {
				max = random2;
				min = random1;
			} else {
				max = random1;
				min = random2;
			}
			
			System.out.println("min : " + min + "," + "max :" + max);
			
			for (int i = min; i <=max; i++) {
				sum += i;
				System.out.println(i + " = " + sum);
			}
	
			System.out.println("total : " + sum );
	}
}
	
			
			
//			여기서 부터 정민님 소스
//			Random rand = new Random();
//			
//			int num1 = rand.nextInt(100);
//			int num2 = rand.nextInt(100);
//			
//			int sum = 0;
//			
//			if(num1 > num2) {
//				for(int i = num2 ; i <= num1; i++) {
//					sum += i;
//					System.out.print(i + " + ");
//					if(i == num1) System.out.print(i + " ");
//				}
//				System.out.print(" = " + sum);
//			} else {
//				for(int i = num1 ; i <= num2; i++) {
//					sum += i;
//					System.out.print(i + " + ");
//					if(i == num2) System.out.print(i + " ");
//				}
//				System.out.print(" = " + sum);
////				System.out.println(num1 + " ~ " + num2 + " 사이의 합은 " + sum);
//			}
			

