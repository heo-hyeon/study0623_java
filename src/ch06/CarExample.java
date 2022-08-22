package ch06;

public class CarExample {

	public static void main(String[] args) {
		
			Car abc = new Car();     //abc는 말그래도 변수 이름(냄비 이름)  Class는 대문자, 변수는 소문자***
									 // Car라는 클래스(다른 java파일 이름)의 새로운 변수 선언
									 // 실행클래스는 new연산자가 있고 일반클래스 new연산자가 없다.
		
			//**풀어서 해석하면 아래와 같이 나타낼수있다.
			//int a = 1;
			// int []b = new int[1];
			
			System.out.println("car.name: " + abc.name);   // 이과정을 인스텐스라고 한다. 
			System.out.println("car.name2[1]: " + abc.name2[1]);
			
			Car car = new Car();
			
			//Car 클래스의 name을 바꾸고 싶을때
			car.name = "제네시스";     //Car class의 변수 이름은 car이기때문에 소문자 car에 .변수명을 써준다.
			System.out.println("car.name: " + car.name);
	}
}

