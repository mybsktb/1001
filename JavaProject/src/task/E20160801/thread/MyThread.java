package task.E20160801.thread;

public class MyThread extends Thread{
	public MyThread(String name){
		super(name);
	}
	
	@Override
    public void run() {
		System.out.println(getName() + "��ʼ��...");
		for(int i=1; i<10; i++){
			System.out.println(getName() + "����...");
		}
		System.out.println(getName() + "������...");
	}
}
