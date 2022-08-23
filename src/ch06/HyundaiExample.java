package ch06;

public class HyundaiExample {

	public static void main(String[] args) {
			
		Hyundai hyundai = new Hyundai();
		
		
		System.out.println("hyundai.name : " + hyundai.name[0]);
		
		for (int i=0; i<hyundai.name.length; i++) { 
			System.out.println("hyundai : " + hyundai.name[i]);
			}
		}
}
