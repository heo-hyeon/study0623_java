package ch03;

public class ConditionalOperationExample {

	public static void main(String[] args) {

		int score = 85;
		
		char grade = score > 90 ? 'A' : 'B' ;
		System.out.println("grade:" + grade);
	
		
		if(grade > 90) {
			System.out.println("grade: A");
		} else { 
			System.out.println("grade: B");
		}
	
	}

}
