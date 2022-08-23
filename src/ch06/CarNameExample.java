package ch06;

public class CarNameExample {

	public static void main(String[] args) {
		
		CarName carname = new CarName("아반떼");
		String name;
		
		CarName carname2 = new CarName("그렌져",3000);
		int CC;
		
		CarName carname3 = new CarName("g80", 3500, "gray");
		String color;
		
		System.out.println("carname.name= " + carname.name);
		System.out.println("carname2.CC= " + carname2.CC);
		System.out.println("carname3.color= " + carname3.color);
	}

}
