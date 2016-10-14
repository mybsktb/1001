package task.E20160802.task7;

public class Test {

	public static void main(String[] args) {
		Apple apl1 = Apple.getInstance();
		Apple apl2 = Apple.getInstance();
		Apple apl3 = Apple.getInstance();
		
		apl1.setPrice(10);
		apl1.setColor("Red");
		apl2.setPrice(10);
		apl2.setColor("Red");
		apl3.setPrice(15);
		apl3.setColor("Green");
		
		if (apl1 == apl2){
			System.out.println("同一个苹果。");
			System.out.println("价格是：" + apl1.getPrice() + " 颜色：" + apl1.getColor());
		} else {
			System.out.println("不同的苹果。");
		}
		
		System.out.println("苹果1的价格是：" + apl1.getPrice() + " 颜色：" + apl1.getColor());
		System.out.println("苹果2的价格是：" + apl2.getPrice() + " 颜色：" + apl2.getColor());
		System.out.println("苹果3的价格是：" + apl3.getPrice() + " 颜色：" + apl3.getColor());
	}

}
