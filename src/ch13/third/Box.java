package ch13.third;

public class Box<T> {
	
	private T t;
	
	
	// 게터세터
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}

	public void out () {
		System.out.println("output");
	}
}
