package ch06;

public class Korean {
	String name = "장원영" ;
	String ssn = "011225-1234567" ;
	int age = 45 ;
	
	
	Korean () {
		
	}
	
	Korean (String name) {
		this.name = name; 
	} 
	
	Korean (String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	Korean (String name, int age) {
		this.name = name;
		this.age = age;
	}
}