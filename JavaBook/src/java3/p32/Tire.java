package java3.p32;

public class Tire {
	public int maxRotation;
	public int accumulateRotation;
	public String location;
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumulateRotation;
		if(accumulateRotation < maxRotation) {
			System.out.println(location + " Tire 수명: " +
		(maxRotation-accumulateRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + "Tire");
			return false;
		}
	}
}