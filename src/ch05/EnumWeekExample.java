package ch05;

public class EnumWeekExample {

	public static void main(String[] args) {
	
		Week abc;
		
		abc = 1;
		abc = "abcdef" ;
		abc = 1.1 ;
		abc = Week.MONDAY ;     //데이터 호출하는 방식 
		
		System.out.println(Week.FRIDAY);
		System.out.println("abc: " + abc);

	}

}
