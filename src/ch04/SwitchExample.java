package ch04;

public class SwitchExample {

	public static void main(String[] args) {
		
		int num = 95;
		
		switch(num) {
		 	case 95:
		 		System.out.println("1번");
		 		break;
		 	case 2:
		 		System.out.println("2");
		 		break;
 			default:
 				System.out.println("1도 2도 아닌 정수입니다.");
 				break;
		}

/*		String position = "사원";
		
		switch (position ) {
		case "사원" :
			System.out.println("연봉은 5,000입니다");
			break;
		case "대리" :
			System.out.
			println("연봉은 6,000입니다");
		case "과장" :
			System.out.println("연봉은 7,000입니다");
		}*/
	}

}
