package task.E20160726.e6.fly;

import task.E20160726.e6.fly.impl.Bird;
import task.E20160726.e6.fly.impl.Plane;
import task.E20160726.e6.fly.impl.Superman;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IFly bird = new Bird();
		IFly plane = new Plane();
		Superman spm = new Superman();
		
		//小鸟飞
		bird.fly();
		//飞机飞
		plane.fly();
		//超人自己飞
		spm.fly();
		//超人坐飞机
		spm.flyByFransport(new Plane());
	}

}
