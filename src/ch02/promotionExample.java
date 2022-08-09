package ch02;

public class promotionExample {

	public static void main(String[] args) {

		// 작은 형이 큰 형으로 변환의 문제가 발생하지 않는다.
		// 큰 형이 작은 형으로 변환이 되려면 문제가 생기거나 이루어져도 데이터 손실이 발생;
		// Byte < short < int < long < float < double
	
		byte bytevalue = 10;
		System.out.println("byteValue:" + bytevalue + "입니다!!");
		
		int intValue = bytevalue;
		System.out.println("intValue:" + intValue);
		
//		int intvalue2 = 1234567890;
//		System.out.println("intValue:" + intValue);
//		
//		int byteValue2 = intvalue2;
//		System.out.println("byteValue2:" + byteValue2 + "입니다!!");
		
		int intValue3 = 200 ;
		System.out.println("intValue3:" +intValue3 + "입니다!");
		
		double doubleValue = intValue3;
		System.out.println("doubleValue:" + doubleValue + "입니다!!!");
	}
}
