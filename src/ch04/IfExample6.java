package ch04;

public class IfExample6 {

	public static void main(String[] args) {
		// int 변수 3개 선언 후 정수에서 최댓값,최솟값 

		int x = 7 ;
		int y = 7 ;
		int z = 7 ;
		
		if(x!=y && y!=x && x!=z) {
			if (x>y && x>z) {
				System.out.println("최댓값은:" + x);
			} else if (y<x && x<z) {
				System.out.println("최댓값은:" + z);
			} else {
				System.out.println("최댓값은:" + y);
			}
	
			if (x<y && x<z) {
				System.out.println("최솟값은:" + x);
			} else if (y<x && y<z) {
				System.out.println("최솟값은:" + y);
			} else {
				System.out.println("최솟값은:" + z);
			}
			}
		}
	}