package task.E20160802.task3;

/**
 * ��
 */
public class Person {
	//����
	private String name;
	//����
	private int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//�ж��Ƿ�������
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
