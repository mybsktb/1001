package task.E20160726.e6.fly.impl;

import task.E20160726.e6.fly.IFly;

/**
 * 超人
 */
public class Superman implements IFly {

	@Override
	public void fly() {
		System.out.println("超人自己飞行");
	}
	
	public void flyByFransport(Plane plane){
		System.out.println("超人坐飞机");
		plane.fly();
	}

}
