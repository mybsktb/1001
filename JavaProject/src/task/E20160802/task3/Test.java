package task.E20160802.task3;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person("Lily",20);
		Person p2 = new Person("Lily",20);
		//�ж������Ƿ�Ϊͬһ��
		if(p1.equals(p2)){
			System.out.println("������ͬһ��");
			System.out.println("������" + p1.getName() + " ���䣺" + p1.getAge());
		} else {
			System.out.println("��ͬ��");
		}
	}

}
