package task.E20160726.e1;

public class Test {

	public static void main(String[] args) {
		Person per1 = new Person("Lucy", 20);
		Person per2 = new Person("Lily", 23);
		
		if (per1.equals(per2)) {
			System.out.println("两者是同一个人");
		} else {
			System.out.println("两者不是同一人");
		}
		
		System.out.println(per1.name);
		System.out.println(per1.age);
		
		System.out.println(per2.name.toString());
	}

}
