package task.E20160801.synchronize;

public class Test {

	public static void main(String[] args) {
		Ticket ticket = new Ticket();
		
		Thread sale1 = new Thread(ticket, "ÊÛÆ±Ìü1");
		Thread sale2 = new Thread(ticket, "ÊÛÆ±Ìü2");
		
		sale1.start();
		sale2.start();
	}

}
