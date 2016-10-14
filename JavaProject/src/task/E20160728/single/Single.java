package task.E20160728.single;

/**
 * 单例模式
 */
public class Single {
	
	private String name;
	private int age;
	private static Single single = new Single();
	
	//构造方法私有化
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
