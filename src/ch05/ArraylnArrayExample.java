package ch05;

public class ArraylnArrayExample {

	public static void main(String[] args) {
		
		int [][] scores = {{99,88,55}, {55,77,66}, {55,55,44}, {55,55,44}, {55,55,77}};
		String [] name = {"강하늘","손예진","한지민","정해인","박보검"};
		String [] subject = {"국어", "영어", "수학"};
		//5명의 국,영,수 점수일 때
		//1. 개인의 평균
		//2. 과목별 평균을 구하여라.
		
		System.out.println("scores[1][1] : " + scores[1][1]);
		System.out.println("scores[3][2] : " + scores[3][2]);
		
		//1. 개인의 평균
		for (int i=0; i<scores.length; i++) { 
			int sum = 0;   //한번돌고나서 다시 0이 되기 위해선 바깥에 빼지말고 여기에 선언
			for(int j=0; j<scores[i].length; j++) {
			sum += scores[i][j];
		}
			System.out.println(name[i] + "의 평균점수는: " + ((double)sum/3));
		}
		
		
		//2. 과목별 평균
		for (int j=0; j<3; j++) {
			int sum = 0;   	//한번돌고나서 다시 0이 되기 위해선 바깥에 빼지말고 여기에 선언
			for (int i=0; i<5; i++) {
				sum += scores[i][j];
			}
			System.out.println(subject[j] + "과목의 평균 점수는: " + ((double)sum/5));
		}
	}
}
