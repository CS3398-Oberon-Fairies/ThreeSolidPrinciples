
package threesolid;

public class Robot extends BaseWorker implements IReboot {

	public void work() {
		// ....working
		System.out.println("Work.exe");
	}

	public void reboot() {
		// ....rebooting
		System.out.println("Beep boop beep. System up and running, again.");
	}

}
