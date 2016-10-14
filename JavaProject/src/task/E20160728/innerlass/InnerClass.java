package task.E20160728.innerlass;

public class InnerClass {
	private String name;
	private static String sex;
	
	class In{
		private int age;

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
	}
	
	class OutClass {

		private String ss;
		
		public void fun() {
			System.out.println("ÄÚ²¿Àà");
		}

		public String getSs() {
			return ss;
		}

		public void setSs(String ss) {
			this.ss = ss;
		}

	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getSex() {
		return sex;
	}
	public static void setSex(String sex) {
		InnerClass.sex = sex;
	}
	
	
}
