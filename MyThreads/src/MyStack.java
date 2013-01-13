
public class MyStack {

	public String[] stack;
	public Pusher push;
	public int last = -1;
	
	public MyStack(int size) {
		this.stack = new String[size];
	}
	
	public int getLast(){
		return last;
	}
	
	public synchronized void push(String str) {
		this.stack[++last] = str;
		print();
	}
	
	public synchronized String pop() {
		String pop = stack[last];
		if(pop != "")
			this.stack[last--] = "";
		print();
		return pop;
	}
	
	public void print(){
		if(last != -1) {
			System.out.println("Stack contains:");
			for(int i = 0; i <= last; i++)
				System.out.println("stack[" + i + "]: " + stack[i] + "");
		}
	}
}
