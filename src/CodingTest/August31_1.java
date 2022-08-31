package CodingTest;

public class August31_1 {
	
	public static void main(String[] args) {


	int[][] scores = {{99,88,55}, {55,77,66}, {55,55,44}, {55,55,44}, {55,55,77}};
	String[] name = {"손예진", "강하늘", "한지민", "박보검", "김우빈"} ;
	String[] subject = {"국어", "영어", "수학"};
	
// Q1. 개인평균 점수
	
	for (int i=0; i<scores.length; i++) {
		int sum = 0;
		for (int j=0; j<scores[i].length; j++) {
			sum += scores[i][j];
		}
			System.out.println(name[i] + "의 평균점수는: " + ((double)sum/scores[i].length));
		}
	

//	Q2. 과목평균 점수
	
	int [] sum2 = new int[3];
	
	for (int i=0; i<scores.length; i++) {
		for (int j=0; j<scores[i].length; j++) {
			sum2[j] += scores[i][j];
		}
	}
		for (int i=0; i<scores.length; i++) {
			System.out.println(subject[i] + "평균점수는 " + ((double)sum2[i]/scores.length));
		}
	}
}