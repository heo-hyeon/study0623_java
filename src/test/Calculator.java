package test;

public class Calculator  {
	

	public double Circlearea(double r) {
		
		double area = Constants.PAI_1 * r * r ;
		System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행");
		return area;
	}
}

//함수는 PAI_1 을 이용하여 param 으로 원의 반지름을 받으며
//리턴은 원의 면적을 계산하여 리터 합니다.
// *일단 원의 면적은 3.14 * 반지름 
// 반지름은 10이라고 친다.
// double area(면적) = Constants.PAI_1 * r * r; (Constants클래스의 PAI_1함수)
// System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행");
// return area; (원면적 구하는 함수를 double area로 선언했기때문)

