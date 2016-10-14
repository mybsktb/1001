package task.E20160726.e6.fly.impl;

import task.E20160726.e6.fly.IFly;

/**
 * 飞机
 */
public class Plane implements IFly {

	@Override
	public void fly() {
		System.out.println("在高空中飞");
	}
}
