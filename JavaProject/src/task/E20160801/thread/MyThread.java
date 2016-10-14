package task.E20160801.thread;

public class MyThread extends Thread{
	public MyThread(String name){
		super(name);
	}
	
	@Override
    public void run() {
		System.out.println(getName() + "开始了...");
		for(int i=1; i<10; i++){
			System.out.println(getName() + "运行...");
		}
		System.out.println(getName() + "结束了...");
	}
}
