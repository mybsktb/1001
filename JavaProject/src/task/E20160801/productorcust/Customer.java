package task.E20160801.productorcust;

/**
 * ������
 */
public class Customer implements Runnable {
	//����
	private Storage stor;
	
	public Customer(Storage stor){
		this.stor = stor;
	}
	
	@Override
	public void run() {
		// ��������ȡ����
		stor.get();
	}

}
