
package threesolid;

import java.util.ArrayList;

public class ProjectManager extends Manager{

	private ArrayList<IWorker> all_workers;

	public ProjectManager(){
		System.out.println("BUT... I can manage multiple workers.");
		this.all_workers = new ArrayList<IWorker>();
	}

	public void setWorker(IWorker w) {
		super.setWorker(w);
	}

	public void addWorker(IWorker w){
		all_workers.add(w);
	}

	public void manage() {
		//...managing as a ProjectManager
		System.out.println(" -> (*in an important voice) Work on that project I said!");
		super.manage();
	}

	public void manageAll(){
		System.out.println(" -> (*in an important voice) Work on those projects I said!");
		for(int it = 0; it < all_workers.size(); it++){
			all_workers.get(it).work();
		}
	}

	public void schedulework() {
		// ....scheduling work
		System.out.println("Scheduling work like a boss...");
	}

}
