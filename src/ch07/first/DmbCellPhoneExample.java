package ch07.first;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		//부모클래스 함수 호출
		CellPhone cellPhone = new CellPhone ();
		cellPhone.powerOn();
		cellPhone.powerOff();
			
		//자식클래스 함수 호출
		DmbCellPhone dmbcellPhone2 = new DmbCellPhone("Iphone12 Pro", "gold", 7) ;
		
		dmbcellPhone2.turnOnDmb();
		dmbcellPhone2.changeChannelDmb(70);
		dmbcellPhone2.turnOffDmb();
			
		// 부모,자식 클래스 함수 호출
		dmbcellPhone2.powerOn();
		dmbcellPhone2.powerOff();
		dmbcellPhone2.bell();
		dmbcellPhone2.sendVoice("자기");
		dmbcellPhone2.receiveVoice("상대방");
		dmbcellPhone2.hangUp();

	}

}
