
public class TempWorker extends BaseWorker implements IEat, ISick {
	
	public void work() {
		//.... working much more
		System.out.println("Eh... I only work here and there.");
	}

	public void eat() {
		//.... eating in launch break
		System.out.println("As a temp I always have time to eat.");
	}
	
	public void sick() {
		//.... worker won't show to work beacause of sickness
		System.out.println("It's totally cool, man. I'm not feeling too good.");
	}

}
