
public class Manager {

	Worker worker;

	public void Manager() {

	}

	public void setWorker(Worker w) {
		worker=w;
	}

	public void manage() {
		worker.work();
	}

}
