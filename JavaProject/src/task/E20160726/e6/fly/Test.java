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
		
		//С���
		bird.fly();
		//�ɻ���
		plane.fly();
		//�����Լ���
		spm.fly();
		//�������ɻ�
		spm.flyByFransport(new Plane());
	}

}
