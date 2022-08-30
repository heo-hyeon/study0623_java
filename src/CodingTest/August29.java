package CodingTest;

public class August29 {

	public static void main(String[] args) {
//		1문제. 1~10까지 for문을 이용해서 더하는 프로그램 작성하시오!
		int sum = 0 ;
		
		for (int i=1; i<10; i++) {
			sum += i;
		}
		
		System.out.println("합계는 : " + sum);

//		2문제. if문을 활용한 학점 매기기 프로그램 작성하기!
		
		int score = 70;
		
		if (score >= 90 && score <= 100) {
			if (score >=97) {
				System.out.println("A+입니다.");
			} else if(score>=92) {
				System.out.println("A-입니다.");
			} else {
				System.out.println("A입니다.");
			}
			}	
			else if (score >=80 && score < 90 ) {
			if(score>=87) {
				System.out.println("B+입니다.");
			} else if (score>=83) {
				System.out.println("B-입니다.");
			} else {
				System.out.println("B입니다.");
			}
			}	
			else if (score >=70 && score < 80) {
				if (score >= 77) {
					System.out.println("C+입니다");
				} else if (score >= 73) {
					System.out.println("C-입니다.");
				} else {
					System.out.println("C입니다.");
				}
			}
			else if (score >=60 && score < 70) {
				if (score>=66) {
					System.out.println("D+입니다.");
				} else if (score >=63) {
					System.out.println("D-입니다.");
				} else {
					System.out.println("D입니다.");
				}
			} else { 
				System.out.println("F입니다.");
			}
	}
}
