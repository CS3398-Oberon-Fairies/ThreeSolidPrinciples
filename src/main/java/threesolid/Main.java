
package threesolid;

public class Main {

	public static void main(String[] args){

		System.out.println("A new day begins...");

		// define three types of managers
		System.out.println("\nThe managers are the first ones to arrive at the scene:");
		Manager manager = new Manager();
		ProductManager product_manager = new ProductManager();
		ProjectManager project_manager = new ProjectManager();

		// and three types of workers
		System.out.println("\nThen the workers arrive, and they are immediately sent to work:");
		BaseWorker base_worker = new BaseWorker();
		Worker worker = new Worker();
		SuperWorker super_worker = new SuperWorker();
		TempWorker temp_worker = new TempWorker();
		
		// the robot is also there;
		Robot robot = new Robot();

		// assign workers to respective managers
		manager.setWorker(base_worker);
		product_manager.setWorker(worker);
		project_manager.addWorker(robot);
		project_manager.addWorker(temp_worker);
		project_manager.addWorker(super_worker);

		// work all the workers
		manager.manage();
		product_manager.manage();
		project_manager.manageAll();

		// have a break, have a kitkat
		System.out.println("\nA quick break:");
		worker.eat();
		super_worker.eat();
		temp_worker.eat();

		// have a break, have a kitkat
		System.out.println("\nMeanwhile the managers did not implement IEat, so they continue to manage:");
		project_manager.schedulework();
		product_manager.defineproduct();
		
		System.out.println("\nStopping...");
		
		System.exit(0);

	}

}
