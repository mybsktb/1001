package task.E20160801.productorcust;

import java.util.ArrayList;
import java.util.List;

public class Storage {

	//笼子最大容量
	private static final int MAX_NUM = 1000;
	//笼子
	private  List<BaoZi> list = new ArrayList<BaoZi>(); 
	
	/**
	 * 放包子
	 * @param bz
	 */
	public void put(BaoZi bz){
		while(true){
			synchronized (list) {
				//笼子放满
				if(list.size() >= MAX_NUM ){
					System.out.println("满了，放不进去了");
					try {
						//等待
						list.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}else{
					System.out.print("放进去一个包子.");
					//添加
					list.add(bz);
					System.out.println("当前有"+list.size()+"个包子");
					//通知
					list.notify();
				}
			}
		}
	}
	
	/**
	 * 取包子
	 */
	public void get(){
		while(true){
			//同步锁
			synchronized (list) {
				//笼子为空
				if(list.size() == 0){
					System.out.println("空了，没有包子...请等待");
					try {
						//等待
						list.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}else{
					System.out.print("取了一个包子...");
					//删除最后一个对象
					list.remove(list.size() -1);//有返回值，返回被删除的对象
					System.out.println("剩余包子数："+list.size());
					//通知
					list.notify();
				}
				
			}
		}
	}
	
}
