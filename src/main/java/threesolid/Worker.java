
package threesolid;

public class Worker extends BaseWorker implements IEat, ISick {

	public void eat() {
		//.... eating in launch break
		System.out.println("Eating a sandwich...");
	}

	public void sick() {
		//.... employee won't show to work beacause of sickness
		System.out.println("Missing work");
	}

    public void work(){
        System.out.println("I'm working already!");
    }

    public int something(){
        return 1;
    }

}