
public class Main {
	
	public static void main(String[] args){

		System.out.println("Starting...");
		Worker w = new Worker();
		SuperWorker sw = new SuperWorker();
		Manager m = new Manager();
		Robot r = new Robot();
		w.eat();
		sw.eat();
		w.work();
		sw.work();
		r.work();
		System.out.println("Stopping...");
		
		System.exit(0);

	}

}
