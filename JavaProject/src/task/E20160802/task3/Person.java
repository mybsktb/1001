package task.E20160802.task3;

/**
 * 人
 */
public class Person {
	//姓名
	private String name;
	//年龄
	private int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//判断是否对象相等
	public boolean equals(Object obj){
		Person per = (Person)obj;
		if ((this.name.compareTo(per.name) == 0) && this.age == per.age) {
			return true;
		} else {
			return false;
		}
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
