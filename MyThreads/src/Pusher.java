
public class Pusher extends Thread{
	public MyStack myStack;
	public String str;
	
	public Pusher(MyStack stack, String str, String name) {
		this.myStack = stack;
		this.str = str;
		this.setName(name);
	}
	
	@Override
	public void run() {
		System.out.println(this.getName() + " is called.");
		for(int i = 0; i < 10; i++) {
			myStack.push(this.str);
		}
		System.out.println("Pushed " + this.str + " in " + this.getName());
		
	}

}
