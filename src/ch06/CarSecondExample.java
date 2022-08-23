package ch06;

public class CarSecondExample {

	public static void main(String[] args) {
		
		CarSecond carsecond = new CarSecond();
		String color;
		
		CarSecond carsecond2 = new CarSecond("blue");
		CarSecond carsecond3 = new CarSecond("white", 3000);
		CarSecond carsecond4 = new CarSecond("white", 3000);
		String color2 = "Red";
		
		System.out.println("CarSecond.color:" + carsecond.color);
		System.out.println("CarSecond2.color:" + carsecond2.color);
		System.out.println("CarSecond3.CC:"+ carsecond3.CC);
	}

}
