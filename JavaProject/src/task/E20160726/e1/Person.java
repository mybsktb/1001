package task.E20160726.e1;

public class Person {
	// Ãû×Ö
	protected String name;
	// ÄêÁä
	protected int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "Lily";
	}

	public boolean equals(Object name) {
		if (this.name.toString() == name) {
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
