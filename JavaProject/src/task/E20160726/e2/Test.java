package task.E20160726.e2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Employee> ls = new ArrayList<Employee>();
		
		//����ʮ��Ա��������н��
		for (int i = 0; i < 10; i++){
			ls.add(new Employee(eName() + i, eMoney()));
		}
		
		Iterator<Employee> it = ls.iterator();
		Employee emp = new Employee("test", 0);
		
		//��������Ա��
		while(it.hasNext()){
			Employee empl = it.next();
			//н�ʱȽ�
			if (empl.getMoney() > emp.getMoney()){
				emp = empl;
			}
			//���Ա��������н��
			System.out.println("name:" + empl.getName() + " money:" + empl.getMoney());
		}
		//���н����ߵ�Ա����������н��
		System.out.println("������ߵ�����:" + emp.getName() + "  ������:" + emp.getMoney());
	}
	
	/**
	 * @return ����
	 */
	public static String eName(){
		return "Employee";
	}
	
	/**
	 * @return н��
	 */
	public static int eMoney(){
		double i = Math.random()*(20000-1000) + 1000;
		int j = (int)i;
		return j;
	}

}
