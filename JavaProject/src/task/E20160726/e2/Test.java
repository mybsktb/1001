package task.E20160726.e2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Employee> ls = new ArrayList<Employee>();
		
		//生成十个员工姓名和薪资
		for (int i = 0; i < 10; i++){
			ls.add(new Employee(eName() + i, eMoney()));
		}
		
		Iterator<Employee> it = ls.iterator();
		Employee emp = new Employee("test", 0);
		
		//遍历所有员工
		while(it.hasNext()){
			Employee empl = it.next();
			//薪资比较
			if (empl.getMoney() > emp.getMoney()){
				emp = empl;
			}
			//输出员工姓名和薪资
			System.out.println("name:" + empl.getName() + " money:" + empl.getMoney());
		}
		//输出薪资最高的员工的姓名和薪资
		System.out.println("工资最高的人是:" + emp.getName() + "  工资是:" + emp.getMoney());
	}
	
	/**
	 * @return 名字
	 */
	public static String eName(){
		return "Employee";
	}
	
	/**
	 * @return 薪资
	 */
	public static int eMoney(){
		double i = Math.random()*(20000-1000) + 1000;
		int j = (int)i;
		return j;
	}

}
