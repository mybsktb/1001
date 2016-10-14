package task.E20160726.e2;

/**
 * 员工
 */
public class Employee {
	//姓名
	private String name;
	//薪资
	private int money;
	
	Employee(String name, int d){
		this.name = name;
		this.money = d;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}
