package task.E20160801.thread;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "��ʼ��...");
		for(int i=1; i<10; i++){
			System.out.println(Thread.currentThread().getName() + "����...");
		}
		System.out.println(Thread.currentThread().getName() + "������...");
	}
}
