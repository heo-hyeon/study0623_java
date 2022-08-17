package ch05;

public class Arraypractice {

	public static void main(String[] args) {

		//scoreChemistry의 평균을 구하고 출력하세요.
		
		int [] scoreChemistry = {95,90,80,75,60};
		
		int sum = 0;
		double avg = 0;
		
		for (int i=0; i<scoreChemistry.length; i++) {
			sum += scoreChemistry[i];
		}
		
		avg = sum /5;
		System.out.println(avg);
	
	//새로운 int 선언 
	int [] arr1 = new int [5];
	//새로운 int에 데이터 넣기
	arr1 [4] = 50;
	System.out.println("arr1 4 :" + arr1[4]);
	}
}
