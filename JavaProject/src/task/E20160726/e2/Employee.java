package task.E20160726.e2;

/**
 * Ա��
 */
public class Employee {
	//����
	private String name;
	//н��
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
