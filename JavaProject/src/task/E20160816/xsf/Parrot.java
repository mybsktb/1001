package task.E20160816.xsf;

public class Parrot extends Bird {
	// private�������ԣ���ʾ˽������
	private String name;
	// protected���Σ���ʾ�ܱ���������
	protected String sex;
	// public���Σ���ʾ����������
	public String color;
	
	// ���췽��
	private Parrot(){}
	// �����Ĺ��췽��
	public Parrot(String _name){
		this.name = _name;
	}
	
	private String say(){
		return "I am " + name +".";
	}
	
	protected void walk(){
		System.out.println("I can walk.");
	}
	
	// ��д
	@Override
	public void fly() {
		System.out.println("I can fly");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
