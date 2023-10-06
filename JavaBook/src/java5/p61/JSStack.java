package java5.p61;

public class JSStack {		// Stack 구현
	private int arr[];
	private int top;
	
	public JSStack() {
		arr = new int[10];
		top = -1;
	}
	public void push(Coin won) {
		arr[++top] = won.getValue();
	}

	public Coin pop() {
		Coin won = new Coin(arr[top--]);
		return won;
	}
	
	public boolean isEmpty() {
		if(top == -1) {
		return true;
		} else {
			return false;
		}
	}
}