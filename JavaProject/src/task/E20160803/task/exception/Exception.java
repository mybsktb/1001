package task.E20160803.task.exception;

public class Exception {
	Cat cat = new Cat();

	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 0;
		String [] arr = {"sdf","sdhfjkh"};
		String strNum = "10a";
		
		try{
			// ���ָ�ʽ�쳣
			//int a = Integer.parseInt(strNum);
			// 
//			int c = ();
		} catch (NumberFormatException e) {
			System.out.println("���ָ�ʽ�쳣");
		} catch (ClassCastException e) {
			System.out.println("����ǿ��ת���쳣");
		} catch (ArithmeticException e) {
			System.out.println("���������쳣");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("�±�Խ���쳣");
		} catch (NullPointerException e) {
			System.out.println("��ָ�������쳣");
		}
	}
	
	class Cat{
	}

}
