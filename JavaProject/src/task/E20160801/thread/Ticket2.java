package task.E20160801.thread;

public class Ticket2 extends Thread {
	private int num = 10;
	
	public Ticket2(int num) {
		this.num = num;
	}

	public void run(){
		while(num > 0){
			System.out.println(Thread.currentThread().getName() + "卖了一张票，还剩" + --num + "张。");
		}
	}
}
