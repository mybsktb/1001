package task.E20160801.thread;

public class Test {

	public static void main(String[] args) {
		/*MyThread mt1 = new MyThread("线程1111");
		MyThread mt2 = new MyThread("线程2222");
		MyThread2 mt3 = new MyThread2();

		mt1.start();
		mt2.start();
		new Thread(mt3,"线程3333").start();*/
		
		/*Ticket tk = new Ticket(10);
		Thread sale1 = new Thread(tk,"售票厅1");
		Thread sale2 = new Thread(tk,"售票厅2");
		
		sale1.start();
		sale2.start();*/
		
		Ticket2 tk2 = new Ticket2(10);
//		Ticket2 tk3 = Ticket2.getInstance();
		Thread sale3 = new Thread(tk2,"售票厅3");
		Thread sale4 = new Thread(tk2,"售票厅4");
//		tk2.start();
//		tk3.start();
		
		sale3.start();
		sale4.start();
	}
}
