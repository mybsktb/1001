package task.E20160801.procustomer;

import java.util.ArrayList;
import java.util.List;

public class Storage {
	private static final int MAX_NUM = 100;
	List<Apple> list = new ArrayList<Apple>();
	
	public void put(Apple apple){
		while(true){
			synchronized(list){
				if (list.size() >= MAX_NUM) {
					System.out.println("笼子已满，请等待...");
					try {
						list.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					System.out.print("放进去一个苹果.");
					list.add(apple);
					System.out.println("当前有"+list.size()+"个苹果");
					list.notify();
				}
			}
		}
	}
	
	public void get(){
		while(true){
			synchronized (list) {
				if(list.size() <= 0){
					System.out.println("笼子已空，请等待...");
					try {
						list.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					System.out.print("取出一个苹果.");
					list.remove(list.size()-1);
					System.out.println("剩余" + list.size() + "个苹果。");
					list.notify();
				}
			}
		}
	}
}
