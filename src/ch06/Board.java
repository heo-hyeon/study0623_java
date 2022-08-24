package ch06;

public class Board {
	
	String name = "허현" ; 
	int viewCount = 630 ;
	boolean useNY = true ;
	
	// 초기값
	Board () {
		
	};
	
	Board (String name) {
		this.name = name ;
	}
	
	Board (String name, int viewCount) {
		this.name = name;
		this.viewCount = viewCount;
	}
	
	Board (String name, boolean useNY) {
		this.name = name;
		this.useNY = useNY;
	}
	
	Board (String name, int viewCount, boolean useNY) {
		this.name = name;
		this.viewCount = viewCount;
		this.useNY = useNY;
	
		
	}

	public void say () {
		System.out.println("이름 : " + name +" "+ "조회수 : " + viewCount + " " + "사용여부 : " + useNY);
	}
	
}
