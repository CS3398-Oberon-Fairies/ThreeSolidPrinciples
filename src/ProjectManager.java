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
  public void schedulework()
  {
    // ....scheduling work
    System.out.println("Scheduling work like a boss...");
  }

}
