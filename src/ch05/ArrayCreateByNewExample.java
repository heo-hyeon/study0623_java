package ch05;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {

		int [] arr1 = new int[3];
		// int[3]은 사다리가 3칸이라는 뜻이다. 배열은 사다리수변화가 없기때문!
		
		int [] arr2 ;
		arr2 = new int[5];
		
		
		arr1[0] = 77;      //사다리 3칸 중 0번째에 77을 선언
		arr1[1] = 88;
		arr1[2] = 99;
		System.out.println("arr1 0 :" + arr1[0]);
		System.out.println("arr1 1 :" + arr1[1]);
		System.out.println("arr1 2 :" + arr1[2]);
	}

}
