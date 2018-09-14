
public class Main {

	public static void main(String[] args){

		try{
			System.out.format("Starting ... \n");
			// initializing all classes to check if they work;
			Worker w = new Worker();
			SuperWorker sw = new SuperWorker();
			Manager m = new Manager();
			ProductManager pm = new ProductManager();
			ProjectManager pjm = new ProjectManager();
			Robot r = new Robot();
			
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


		}catch (Exception main_except){
			main_except.printStackTrace();
		}

		try{
			System.out.format("Stopping ... \n");
		}catch (Exception main_except){
			main_except.printStackTrace();
		}

		System.exit(0);

	}

}
