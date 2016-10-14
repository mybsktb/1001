package task.E20160801.thread;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "开始了...");
		for(int i=1; i<10; i++){
			System.out.println(Thread.currentThread().getName() + "运行...");
		}
		System.out.println(Thread.currentThread().getName() + "结束了...");
	}
}
