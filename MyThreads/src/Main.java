public class Main {
	
	public static void main(String[] args){
		MyStack myStack = new MyStack(20);
		
		Pusher pusher1 = new Pusher(myStack, "String 2", "PUSHER1");
		pusher1.start();
		Pusher pusher2 = new Pusher(myStack, "String 1", "PUSHER2");
		pusher2.start();
		Popper popper = new Popper(myStack, "POPPER");
		popper.start();
	}
}
