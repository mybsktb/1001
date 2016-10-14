package task.E20160801.productorcust;

public class Test {
	public static void main(String[] args) {
		Storage stor = new Storage();
		Productor pd = new Productor(stor);
		Customer cs = new Customer(stor);
		new Thread(pd).start();
		new Thread(cs).start();
		new Thread(cs).start();
		new Thread(cs).start();
		new Thread(cs).start();
		
	}
}
