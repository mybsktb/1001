package task.E20160802.task7;

/**
 * ����ģʽ
 *
 */
public class Apple {
	//�½�һ��Apple����
	private static Apple apple = new Apple();
	//�۸�
	private int price;
	//��ɫ
	private String color;
	
	//���췽��˽�л�
	private Apple(){}
	
	//����Apple����
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
