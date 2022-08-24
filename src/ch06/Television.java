package ch06;

public class Television {
	// static
		public static String company = "samsung";
		public static String model = "OLED" ;
		public static String info ;
		
		
		
	// 일반
		public String version = "1.0" ;
		
		static {
			info = company + " " + model;
		}
}
