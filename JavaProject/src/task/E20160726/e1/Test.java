package task.E20160726.e1;

public class Test {

	public static void main(String[] args) {
		Person per1 = new Person("Lucy", 20);
		Person per2 = new Person("Lily", 23);
		
		if (per1.equals(per2)) {
			System.out.println("������ͬһ����");
		} else {
			System.out.println("���߲���ͬһ��");
		}
		
		System.out.println(per1.name);
		System.out.println(per1.age);
		
		System.out.println(per2.name.toString());
	}

}
