package java3.p7;

public class DmbCellphoneExample {

	public static void main(String[] args) {
		DmbCellphone dmbCellphone = new DmbCellphone("자바폰", "검정", 10);
		
		System.out.println("model : " + dmbCellphone.model);
		System.out.println("color : " + dmbCellphone.color);
		System.out.println("channel : " + dmbCellphone.channel);
		
		dmbCellphone.powerOn();
		dmbCellphone.powerOff();
		dmbCellphone.sendVoice("여보세요?");
		dmbCellphone.receiveVoice("네, 반갑습니다");
		dmbCellphone.hangup();
		
		dmbCellphone.turnOnDmb();
		dmbCellphone.changeChannelDmb(12);
		dmbCellphone.turnOffDmb();
	}
}