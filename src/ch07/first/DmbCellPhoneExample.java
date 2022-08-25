package ch07.first;

public class DmbCellPhoneExample {
	
	public static void main (String[] args) {
	
	// 부모 객체를 생성하고 powerOn 메서드 실행
	
	
	CellPhone cellPhone = new CellPhone();
	
	cellPhone.powerOn ();
	
	
	// 자식 객체 생성
	DmbCellPhone dmbcellPhone = new DmbCellPhone () ;
	
	// 자식 객체와 turnOFFDmb실행
	dmbcellPhone.turnOffDmb();
	
	// 생성자를 이용하여 자식 개체 생성
	DmbCellPhone dmbcellPhone2 = new DmbCellPhone("Iphone12 Pro", "gold", 6);
	
	// dmbcellPhone2 객체를 사용하여 자식 클래스의 함수 전체 포함
	dmbcellPhone2.turnOnDmb();
	dmbcellPhone2.changeChannelDmb(89);
	dmbcellPhone2.turnOffDmb();
	
	// dmbcellPhone2 객체를 사용하여 부모 클래스의 함수 전체 포함
	dmbcellPhone2.powerOn();
	dmbcellPhone2.powerOff();
	dmbcellPhone2.bell();
	dmbcellPhone2.sendVoice("현이");
	dmbcellPhone2.receiveVoice("현이");
	dmbcellPhone2.hangUp();
	}
}
