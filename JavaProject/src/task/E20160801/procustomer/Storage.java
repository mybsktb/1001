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
					System.out.println("������������ȴ�...");
					try {
						list.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					System.out.print("�Ž�ȥһ��ƻ��.");
					list.add(apple);
					System.out.println("��ǰ��"+list.size()+"��ƻ��");
					list.notify();
				}
			}
		}
	}
	
	public void get(){
		while(true){
			synchronized (list) {
				if(list.size() <= 0){
					System.out.println("�����ѿգ���ȴ�...");
					try {
						list.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					System.out.print("ȡ��һ��ƻ��.");
					list.remove(list.size()-1);
					System.out.println("ʣ��" + list.size() + "��ƻ����");
					list.notify();
				}
			}
		}
	}
}
