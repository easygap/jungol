package java3.p47;

public class PhoneExample {

	public static void main(String[] args) {
		// Phone phone = new SmartPhone("홍길동");
		
		Phone phone1 = new Smartphone("성심당");
		phone1.turnOn();
		phone1.turnOff();
		System.out.println();
		
		Smartphone smartphone = new Smartphone("홍길동");
		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();
	}
}