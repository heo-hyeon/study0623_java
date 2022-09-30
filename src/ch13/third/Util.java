package ch13.third;

public class Util {

	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
		
	
//		원래 했던 방식
//		public String aaa (String name) {
//			String xxxx = "";
//			
//			return xxxx;
		
	}
}
