package task.E20160801.thread;

public class Ticket implements Runnable {

	private int num = 200;
	
	public Ticket(int num){
		this.num = num;
	}
	@Override
	public void run() {
		while(num > 0){
			System.out.println(Thread.currentThread().getName() + "卖了一张票，还剩" + --num + "张。");
		}
	}
}
