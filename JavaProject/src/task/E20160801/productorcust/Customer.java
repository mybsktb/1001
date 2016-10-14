package task.E20160801.productorcust;

/**
 * 消费者
 */
public class Customer implements Runnable {
	//笼子
	private Storage stor;
	
	public Customer(Storage stor){
		this.stor = stor;
	}
	
	@Override
	public void run() {
		// 从笼子里取包子
		stor.get();
	}

}
