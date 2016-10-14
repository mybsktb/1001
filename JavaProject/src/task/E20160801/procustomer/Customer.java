package task.E20160801.procustomer;

public class Customer implements Runnable {
	Storage stor = new Storage();

	public Customer(Storage stor){
		this.stor = stor;
	}
	
	@Override
	public void run() {
		stor.get();
	}

}
