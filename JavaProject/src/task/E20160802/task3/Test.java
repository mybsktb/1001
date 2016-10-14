package task.E20160802.task3;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person("Lily",20);
		Person p2 = new Person("Lily",20);
		//判断两人是否为同一人
		if(p1.equals(p2)){
			System.out.println("两者是同一人");
			System.out.println("姓名：" + p1.getName() + " 年龄：" + p1.getAge());
		} else {
			System.out.println("不同人");
		}
	}

}
