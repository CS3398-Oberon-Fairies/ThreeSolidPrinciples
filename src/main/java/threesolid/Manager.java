
package threesolid;

public class Manager {

	private IWorker worker;

	public Manager(){
		System.out.println("Just a basic manager...");
	}

	public void setWorker(IWorker w) {
		worker=w;
	}

	public void manage() {
		worker.work();
	}


}
