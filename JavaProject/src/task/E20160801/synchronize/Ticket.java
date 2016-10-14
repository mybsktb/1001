package task.E20160801.synchronize;

public class Ticket implements Runnable {
	//票数
	private int num = 10;
//	private static Object obj = new Object();
	
	@Override
	public void run(){
		while (true) {
			/*//同步锁
			synchronized(obj){
				//票数为零
				if (num <= 0) {
					break;
				}
				System.out.print(Thread.currentThread().getName() + "出票中");
				for (int i = 0; i < 3; i++) {
					try {
						//等待1秒
						Thread.sleep(1000);
						System.out.print(".");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("");
				System.out.println(Thread.currentThread().getName() + "卖出了一张票，剩余" + --num + "张。");
			}*/
			
			if (!sale()) {
				break;
			}
		}
	}
	
	private synchronized boolean sale(){
		//票数为零
		if (num <= 0) {
			return false;
		}
		System.out.print(Thread.currentThread().getName() + "出票中");
		for (int i = 0; i < 3; i++) {
			try {
				//等待1秒
				Thread.sleep(500);
				System.out.print(".");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("");
		System.out.println(Thread.currentThread().getName() + "卖出了一张票，剩余" + --num + "张。");
		return true;
	}
}
