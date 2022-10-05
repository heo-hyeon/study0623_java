package ch12.first;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	public static void main(String[] args) {
		//toolkit = 소리가 나게 해주는 객체
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		
		for(int i=0; i<5; i++) {		
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}
			// sleep(500)잠깐 멈추는 시간 단위
		}

		for(int i=0; i<5; i++) {
			System.out.println("29");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}
