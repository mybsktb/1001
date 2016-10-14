package task.E20160816.xsf;

public class Test {
	public static void main(String[] args) {
		Parrot parrot = new Parrot("Poly");
		// ����ֱ����˽�й��췽����newһ������
		//Parrot parrot1 = new Parrot();
		
		// ����������ֱ��ʹ��
		if(IFly.CAN_FLY){
			// �����з�����ʹ��
			parrot.fly();
		}
		// �����ܱ����ķ�����ʹ��
		parrot.walk();
		// ˽�з���������
		//parrot.say();
		// �������Կ�ֱ��ʹ��
		parrot.color = "green";
		// �ܱ���������
		parrot.sex = "male";
		// ˽�����Բ���ֱ��ʹ�ã���ͨ��getXxx/setXxx���з���
		//parrot.name = "Lily";
		// �����еĹ��������ɷ���
		parrot.eat();
		// �����е��ܱ����ķ����ɷ���
		parrot.sing();
		// �����е�˽�з������ɷ���
		//parrot.fun();
	}
}
