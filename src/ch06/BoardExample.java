package ch06;

public class BoardExample {

	public static void main(String[] args) {
		
		Board board = new Board();
		
		Board board1 = new Board("손예진 ");
		String name;
		
		Board board2 = new Board("강하늘 ", 870 ) ;
		int viewCount;
		
		Board board3 = new Board("정해인 ", false );
		boolean useNY;
		
		Board board4 = new Board("한지민 ", 750, false);
		
		
		board.say();
		board1.say();
		board2.say();
		board3.say();
		board4.say();
		
		
		
		
//		
//		Board board = new Board("손예진");
//		String name; 
//		
//		Board board2 = new Board("강하늘", 500);
//		int viewCount;
//		
//		Board board3 = new Board("정해인", true);
//		boolean useNY;
//		
//		Board board4 = new Board("한지민", 750, false);
//		
//		Board board5 = new Board();
//		
//		board.say();
//		board2.say();
//		board3.say();
//		board4.say();
//		board5.say();
	}

}

