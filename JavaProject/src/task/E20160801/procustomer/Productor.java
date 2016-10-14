package task.E20160801.procustomer;

public class Productor implements Runnable {
	Storage stor = new Storage();
	
	public Productor(Storage stor){
		this.stor = stor;
	}
	
	@Override
	public void run() {
		stor.put(new Apple());
	}
}
