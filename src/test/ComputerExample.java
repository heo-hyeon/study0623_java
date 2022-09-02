package test;

public class ComputerExample {

	public static void main(String[] args) {
	
		double r = (double) 7 ;
		
		
		Calculator calculator = new Calculator ();
		System.out.println("원의 반지름 : " + r);
		
		System.out.println("원면적 : " + calculator.Circlearea(r));
		
		Computer computer = new Computer ();
		System.out.println("원면적 : " + computer.Circlearea(r));
	}

}


// 1. double r = (double) 7; 변수 선언 
// 2. Calculator calculator = new Calculator () ;   
// 3. System.out.println("원의 반지름 : " + r);
// 4. System.out.println("원면적 : " + calculator.Circlearea(r));
// 5. Computer computer = new Computer ();
// 6. System.out.println("원면적 : Computer.Circlearea(r));