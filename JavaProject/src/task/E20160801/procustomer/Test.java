package task.E20160801.procustomer;

public class Test {

	public static void main(String[] args) {
		Storage stor = new Storage();
		Productor pro = new Productor(stor);
		Customer cstm = new Customer(stor);
	
		new Thread(pro).start();
		new Thread(pro).start();
		new Thread(cstm).start();
		new Thread(cstm).start();
		new Thread(cstm).start();
	}

}
