
package threesolid;

public class Worker extends BaseWorker implements IEat, ISick {

	public void eat() {
		//.... eating in launch break
		System.out.println("Eating a sandwich...");
	}

	public String sick() {
		//.... employee won't show to work beacause of sickness
		System.out.println("Missing work");
		return("Missing work");
	}

    public int something(){
        return 1;
    }

}
