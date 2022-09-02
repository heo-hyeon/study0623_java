package test;

public class Computer extends Calculator {
	
	@Override
	 public double Circlearea(double r1) {
		double area = Constants.PAI_2 * r1 * r1 ;
		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
		return area ;
	  }
}

//1. Calculator를 상속 받습니다.
//2.함수는 PAI_2 을 이용하여 param 으로 원의 반지름을 받으며
//3. 리턴은 원의 면적을 계산하여 리터 합니다. 
//(단 Calculator에서 생성한 함수를 override 하여 구현)

//1. Computer(자식) experts Calculator(부모)
//@Override    오버라이드는 선언문 위에!
//2. public double area = Constants.PAI_2 * r * r ;
//3. return area;