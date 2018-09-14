
package threesolid;

public class ProjectManager extends Manager{

	public void setWorker(Worker w) {
		super.setWorker(w);
	}

	public void manage() {
		//...managing as a ProjectManager
    System.out.println("Work on that project I said!");
	  super.manage();
	}

  public void schedulework() {
    // ....scheduling work
    System.out.println("Scheduling work like a boss...");
  }

}
