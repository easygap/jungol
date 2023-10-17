package java2.sedanFactory;

import java2.component.Tire;

public class Sedan {

	public static void main(String[] args) {
	// 	java2.component.Tire compoTire = new java2.component.Tire();
		Tire compoTire = new Tire();
		compoTire.setSize(20);

		System.out.println(compoTire.getSize());
		System.out.println(compoTire.BigTire());
	}
}