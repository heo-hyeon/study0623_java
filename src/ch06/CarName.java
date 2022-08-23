package ch06;

public class CarName {
	
	String name = "아반떼";
	int CC = 1500;
	String color = "white";
	
	CarName (String name) {     //String뒤에 str은 내 맘대로 이름 정해줄 수 있다.
		this.name = name;
	}
	
	CarName (String name, int CC) {
		this.name = name;
		this.CC = CC;
	}
	
	CarName (String name, int CC, String color) {
		this.name = name;
		this.CC = CC;
		this.color = color;
		
		// 변수 선언시 이름 똑같이 해주는 게 좋다.
	}
}



