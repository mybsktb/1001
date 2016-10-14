package task.E20160728.single;

/**
 * ����ģʽ
 */
public class Single {
	
	private String name;
	private int age;
	private static Single single = new Single();
	
	//���췽��˽�л�
	private Single(){}
	
	public static Single getInstance(){
		return single;
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
	
}
