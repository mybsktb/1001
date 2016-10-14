package task.E20160801.productorcust;

/**
 * 生产者
 */
public class Productor implements Runnable {
	//笼子
	private Storage stor;
	
	public Productor(Storage stor){
		this.stor = stor;
	}
	
	@Override
	public void run() {
		// 往笼子里放包子
		stor.put(new BaoZi());
	}

}
