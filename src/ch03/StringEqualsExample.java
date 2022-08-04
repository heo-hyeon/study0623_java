package ch03;

public class StringEqualsExample {

	public static void main(String[] args) {

		
		//String은 예외적으로 문자열 비교가 아니라 문자 저장 주소로 비교한다.
		String str1 = "허현";
		String str2 = "허현"	;
		String str3 = new String("허현");
	
		boolean result1 = (str1 == str2);
		System.out.println("result1:" + result1);  // true
		
		boolean result2 = (str1 == str3);
		System.out.println("result2:" + result2);  // false
		
		//문자열을 비교하고싶을때는 .equals 함수 써주기
		System.out.println("str1.equals(str2):" + str1.equals(str2));  // == (X) true
		System.out.println("str1.equals(str3):" + str1.equals(str3));  // == (X) true
	}
}