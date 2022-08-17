package ch05;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {

		int [] scoreEnglsih;
		int [] scoreMath [];
		int[] scoreChemistry = {95,70,88,65,73} ;

		String [] name = {"손예진", "한지민", "강하늘"};
		
		
		//scoreChemistry의 평균을 구하고 출력하세요.
		//배열 컨트롤할때는 1말고 0부터 시작
		//for문은 결과가 확실하게 나온다.
		int sum = 0 ;
		double avg = 0 ;
		
		for (int i=0; i<=4; i++) {           
	    //for(int i=0; i < scoreChemistry.length; i++ { 가 더 자주 쓰이는 코드이다.
			sum += scoreChemistry[i];
		}
		
		avg = sum/5;
		System.out.println(avg);
		
		
		
		System.out.println ("누굴까 : " + name[2]) ;    //0부터 시작하니까 한지민이 아니라 강하늘
		System.out.println ("명지님 화학성적 : " + scoreChemistry[0]);
		
	}
}
		

