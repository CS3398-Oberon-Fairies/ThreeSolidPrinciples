
public class Manager {
	Worker worker = new Worker();


	public void setWorker(Worker w) {
		worker=w;
	}

	public void manage() {
		worker.work();
	}


}
