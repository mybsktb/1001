package task.E20160803.task.reflect;

/**
 * ӳ��
 *
 */
public class Reflect {
	// ��������
	public String name;
	// �ܱ�������
	protected int age;
	// ˽������
	private boolean sex;

	private void fun1(){
		System.out.println("˽�еķ���");
	}
	
	public void fun2(){
		System.out.println("���еķ���");
	}
	
	protected void fun3(){
		System.out.println("�ܱ����ķ���");
	}
	/** ���еĹ��췽��*/
	public Reflect(){
		
	}
	/** ˽�й��췽��*/
	private Reflect(String _name){
		this.name = _name;
	}
	/** �ܱ����Ĺ��췽�� */
	protected Reflect(int _age){
		this.age = _age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}


}
