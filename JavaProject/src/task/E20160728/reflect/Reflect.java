package task.E20160728.reflect;

/**
 * 映射
 *
 */
public class Reflect {
	public String name;
	protected int age;
	private boolean sex;

	public static void main(String[] args) throws ClassNotFoundException {
		//获取class类型
		Class<Reflect> c1 = Reflect.class;
		System.out.println(c1);
		Reflect rf = new Reflect();
		System.out.println(rf.getClass());
		Class<?> c2 = Class.forName("task.E20160728.reflect.Reflect");
		System.out.println(c2);
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
