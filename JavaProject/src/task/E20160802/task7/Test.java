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
			System.out.println("ͬһ��ƻ����");
			System.out.println("�۸��ǣ�" + apl1.getPrice() + " ��ɫ��" + apl1.getColor());
		} else {
			System.out.println("��ͬ��ƻ����");
		}
		
		System.out.println("ƻ��1�ļ۸��ǣ�" + apl1.getPrice() + " ��ɫ��" + apl1.getColor());
		System.out.println("ƻ��2�ļ۸��ǣ�" + apl2.getPrice() + " ��ɫ��" + apl2.getColor());
		System.out.println("ƻ��3�ļ۸��ǣ�" + apl3.getPrice() + " ��ɫ��" + apl3.getColor());
	}

}
