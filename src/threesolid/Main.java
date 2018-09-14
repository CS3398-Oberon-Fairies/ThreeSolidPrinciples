
package threesolid;

public class Main {

	public static void main(String[] args){

		System.out.println("Starting...");

		BaseWorker bw = new BaseWorker();
		Worker w = new Worker();
		SuperWorker sw = new SuperWorker();
		Manager m = new Manager();
		ProductManager pm = new ProductManager();
		ProjectManager pjm = new ProjectManager();
		Robot r = new Robot();

		bw.work();
		w.eat();
		sw.eat();
		w.work();
		sw.work();
		r.work();
		m.manage();
		pm.manage();
		pjm.manage();
		m.setWorker(w);
		pm.setWorker(w);
		pjm.setWorker(w);
		pm.defineproduct();
		pjm.schedulework();
		
		System.out.println("Stopping...");
		
		System.exit(0);

	}

}
