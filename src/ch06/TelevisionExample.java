package ch06;

public class TelevisionExample {

	public static void main(String[] args) {
		// static
		System.out.println(Television.company);
		System.out.println(Television.model);
		System.out.println(Television.info);
		
		//일반
		Television television = new Television();
		
		System.out.println(television.version);
		

	}

}
