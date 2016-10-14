package task.E20160803.task.exception;

public class Exception {
	Cat cat = new Cat();

	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 0;
		String [] arr = {"sdf","sdhfjkh"};
		String strNum = "10a";
		
		try{
			// 数字格式异常
			//int a = Integer.parseInt(strNum);
			// 
//			int c = ();
		} catch (NumberFormatException e) {
			System.out.println("数字格式异常");
		} catch (ClassCastException e) {
			System.out.println("类型强制转换异常");
		} catch (ArithmeticException e) {
			System.out.println("算术运算异常");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("下标越界异常");
		} catch (NullPointerException e) {
			System.out.println("空指针引用异常");
		}
	}
	
	class Cat{
	}

}
