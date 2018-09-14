package threesolid

public class Main {
	
	public static void main(String[] args){

		try{
			System.out.format("Starting ... \n");
			// initializing all classes to check if they work;
			BaseWorker bw = new BaseWorker();
			Worker w = new Worker();
			SuperWorker sw = new SuperWorker();
			Manager m = new Manager();
			ProductManager pdm = new ProductManager();
			ProjectManager pjm = new ProjectManager();
			Robot r = new Robot();
		}catch (Exception main_except){
			main_except.printStackTrace();
		}
		
		try{
			w.eat();
			sw.eat();
			bw.work();
			w.work();
			sw.work();
			r.work();
			w.sick();
			sw.sick();
			pdm.defineproduct();
			pjm.schedulework();
			r.reboot();
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
