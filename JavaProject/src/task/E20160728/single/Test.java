package task.E20160728.single;

public class Test {

	public static void main(String[] args) {
		
		Single single = Single.getInstance();
		Single ss = Single.getInstance();
		Person per = new Person();
		Person per2 = new Person();
		
		single.setName("lucy");
		single.setAge(20);
		ss.setName("jucy");
		ss.setAge(21);
		per.setName("lucy");
		per.setAge(20);
		per2.setName("lucy");
		per2.setAge(20);

		if (single == ss) {
			System.out.println("single:" + "两个是同一个人");
			System.out.println("single name:" + single.getName() + " age:" + single.getAge());
			System.out.println("single name:" + ss.getName() + " age:" + ss.getAge());
		} else {
			System.out.println("single:" + "两者是不同人");
		}
		
		if (per.equals(per2)) {
			System.out.println("两个是同一个人");
		} else {
			System.out.println("两者是不同人");
		}
		
	}

}
