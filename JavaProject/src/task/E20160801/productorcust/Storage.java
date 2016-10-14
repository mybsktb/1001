package task.E20160801.productorcust;

import java.util.ArrayList;
import java.util.List;

public class Storage {

	//�����������
	private static final int MAX_NUM = 1000;
	//����
	private  List<BaoZi> list = new ArrayList<BaoZi>(); 
	
	/**
	 * �Ű���
	 * @param bz
	 */
	public void put(BaoZi bz){
		while(true){
			synchronized (list) {
				//���ӷ���
				if(list.size() >= MAX_NUM ){
					System.out.println("���ˣ��Ų���ȥ��");
					try {
						//�ȴ�
						list.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}else{
					System.out.print("�Ž�ȥһ������.");
					//���
					list.add(bz);
					System.out.println("��ǰ��"+list.size()+"������");
					//֪ͨ
					list.notify();
				}
			}
		}
	}
	
	/**
	 * ȡ����
	 */
	public void get(){
		while(true){
			//ͬ����
			synchronized (list) {
				//����Ϊ��
				if(list.size() == 0){
					System.out.println("���ˣ�û�а���...��ȴ�");
					try {
						//�ȴ�
						list.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}else{
					System.out.print("ȡ��һ������...");
					//ɾ�����һ������
					list.remove(list.size() -1);//�з���ֵ�����ر�ɾ���Ķ���
					System.out.println("ʣ���������"+list.size());
					//֪ͨ
					list.notify();
				}
				
			}
		}
	}
	
}
