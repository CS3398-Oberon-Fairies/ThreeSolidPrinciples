
package threesolid;

public class ProductManager extends Manager{

	public ProductManager(){
		System.out.println("BUT... I manage products, or whatever.");
	}

	public void setWorker(IWorker w) {
		super.setWorker(w);
	}

	public void manage() {
		//...managing as ProductManager
		System.out.println(" -> (*in an important voice) Work on that product pleb!");
		super.manage();
	}

	public void defineproduct() {
		// ....defining product
		System.out.println("Defining product substantially...");
	}

}
