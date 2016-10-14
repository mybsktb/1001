package task.E20160803.task.reflect;

/**
 * 映射
 *
 */
public class Reflect {
	// 公有属性
	public String name;
	// 受保护属性
	protected int age;
	// 私有属性
	private boolean sex;

	private void fun1(){
		System.out.println("私有的方法");
	}
	
	public void fun2(){
		System.out.println("公有的方法");
	}
	
	protected void fun3(){
		System.out.println("受保护的方法");
	}
	/** 公有的构造方法*/
	public Reflect(){
		
	}
	/** 私有构造方法*/
	private Reflect(String _name){
		this.name = _name;
	}
	/** 受保护的构造方法 */
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
