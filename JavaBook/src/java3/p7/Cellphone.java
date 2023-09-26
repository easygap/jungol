package java3.p7;

public class Cellphone {
	String model;
	String color;
	
	void powerOn() {
		System.out.println("Power On");
	}
	
	void powerOff() {
		System.out.print("Power Off");
	}
	
	void bell() {
		System.out.print("Bell ring");
	}
	
	void sendVoice(String message) {
		System.out.println("Send Message : " + message);
	}
	
	void receiveVoice(String message) {
		System.out.println("Receive Message : " + message);
	}
	
	void hangup() {
		System.out.println("Hang Up");
	}
}
