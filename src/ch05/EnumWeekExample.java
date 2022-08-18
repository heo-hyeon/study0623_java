package ch05;

public class EnumWeekExample {

	public static void main(String[] args) {
	
		Week abc;
		
		Week xyz;
		
//		abc = 1;
//		abc = "abcdef" ;
//		abc = 1.1 ;
		abc = Week.MONDAY ;     //데이터 호출하는 방식 
		
		System.out.println(Week.FRIDAY);
		System.out.println("abc: " + abc);
		
		String name = abc.name();   //abc를 문자열로 만들어 주는 것
		System.out.println("name: " + name);
		
		int ordinal = abc.ordinal();
		System.out.println("ordinal: " + ordinal);  //MONDAY의 INDEX값을 알려주는것
		
		xyz = Week.THURSDAY ;
		
		int result1 = abc.compareTo(xyz);
		int result2 = xyz.compareTo(abc);
	
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		
		Week[] days = Week.values();              // Values는 값을 하나하나 다 보여준다. 
		int index = 0;
		for(Week day : days) {
			System.out.println(index + " :day: " + day);
			index ++;
		}
	}
}
