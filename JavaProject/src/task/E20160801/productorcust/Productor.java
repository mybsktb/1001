package task.E20160801.productorcust;

/**
 * ������
 */
public class Productor implements Runnable {
	//����
	private Storage stor;
	
	public Productor(Storage stor){
		this.stor = stor;
	}
	
	@Override
	public void run() {
		// ��������Ű���
		stor.put(new BaoZi());
	}

}
