package task.E20160801.synchronize;

public class Ticket implements Runnable {
	//Ʊ��
	private int num = 10;
//	private static Object obj = new Object();
	
	@Override
	public void run(){
		while (true) {
			/*//ͬ����
			synchronized(obj){
				//Ʊ��Ϊ��
				if (num <= 0) {
					break;
				}
				System.out.print(Thread.currentThread().getName() + "��Ʊ��");
				for (int i = 0; i < 3; i++) {
					try {
						//�ȴ�1��
						Thread.sleep(1000);
						System.out.print(".");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("");
				System.out.println(Thread.currentThread().getName() + "������һ��Ʊ��ʣ��" + --num + "�š�");
			}*/
			
			if (!sale()) {
				break;
			}
		}
	}
	
	private synchronized boolean sale(){
		//Ʊ��Ϊ��
		if (num <= 0) {
			return false;
		}
		System.out.print(Thread.currentThread().getName() + "��Ʊ��");
		for (int i = 0; i < 3; i++) {
			try {
				//�ȴ�1��
				Thread.sleep(500);
				System.out.print(".");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("");
		System.out.println(Thread.currentThread().getName() + "������һ��Ʊ��ʣ��" + --num + "�š�");
		return true;
	}
}
