
public class SuperWorker extends BaseWorker implements IEat, ISick {
	
	public void work() {
		//.... working much more
		System.out.println("Working and telling other people what to do.");
	}

	public void eat() {
		//.... eating in launch break
		System.out.println("Eating while having everybody else get back to work.");
	}
	
	public void sick() {
		//.... worker won't show to work beacause of sickness
		System.out.println("Paid vacation");
	}

}
