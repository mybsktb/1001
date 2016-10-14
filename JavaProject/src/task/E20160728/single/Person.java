package task.E20160728.single;

public class Person {
	private String name;
	private int age;
	
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

    public boolean equals(Person per) {
    	if(this.age == per.age && this.name == per.name){
    		return true;
    	}
        return false;
    }
}
