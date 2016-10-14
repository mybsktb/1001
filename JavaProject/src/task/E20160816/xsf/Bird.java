package task.E20160816.xsf;

/** abstract�����࣬��ʾ������*/
public abstract class Bird implements IFly {
	
	// abstract���η�������ʾ���󷽷�
	public abstract void fly();
	
	// public���η�������ʾ�����ķ���
	public void eat(){
		System.out.println("eat");
	}

	// �ܱ����ķ�����������������ʹ��
	protected String sing(){
		return "I can sing";
	}
	
	// ˽�з���������ʹ��
	private void fun(){}
}
