
public class SuperWorker extends Worker {
	
	public void work() {
		super.work();
		//.... working much more
		System.out.println("And telling other people what to do.");
	}

	public void eat() {
		super.eat();
		//.... eating in launch break
		System.out.println("And having everybody get back to work.");
	}

}
