package task.E20160726.e6.fly.impl;

import task.E20160726.e6.fly.IFly;

/**
 * ����
 */
public class Superman implements IFly {

	@Override
	public void fly() {
		System.out.println("�����Լ�����");
	}
	
	public void flyByFransport(Plane plane){
		System.out.println("�������ɻ�");
		plane.fly();
	}

}
