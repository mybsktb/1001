package task.E20160802.task7;

/**
 * 单例模式
 *
 */
public class Apple {
	//新建一个Apple对象
	private static Apple apple = new Apple();
	//价格
	private int price;
	//颜色
	private String color;
	
	//构造方法私有化
	private Apple(){}
	
	//返回Apple对象
	public static Apple getInstance(){
		return apple;
	}
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
