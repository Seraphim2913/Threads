
public class Popper extends Thread {
	public MyStack myStack;
	
	public Popper(MyStack stack, String name) {
		this.myStack = stack;
		this.setName(name);
	}
	
	@Override
	public void run() {
		String pop = "" + myStack.last;
		
		System.out.println(this.getName() + " is called.");
		for(int i = 0; i < 10 && myStack.getLast() != -1; i++) {
			pop = myStack.pop();
		}
		
		System.out.println("Popped " + pop + " in " + this.getName());
	}
}
