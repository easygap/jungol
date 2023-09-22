package java2.component;

public class Tire {
	private int size;

	public void setSize(int size) {
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}
	
	public int BigTire() {
		return size * 2;
	}
}