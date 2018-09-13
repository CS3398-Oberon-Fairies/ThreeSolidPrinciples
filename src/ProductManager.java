public class ProjectManager extends Manager{

	Worker worker;

	public void ProjectManager() {

	}

	public void setWorker(Worker w) {
		super.setWorker(w);
	}

	public void manage() {
    super.manage();
		worker.work();
	}
  public void defineproduct()
  {
    // ....defining product
    System.out.println("Defining product substantially...");
  }

}
