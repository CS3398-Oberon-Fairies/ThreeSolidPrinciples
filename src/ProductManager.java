
public class ProductManager extends Manager{

	public void setWorker(Worker w) {
		super.setWorker(w);
	}

	public void manage() {
		//...managing as ProductManager
		System.out.println("Work on that product pleb!");
    super.manage();
	}

  public void defineproduct() {
    // ....defining product
    System.out.println("Defining product substantially...");
  }

}
