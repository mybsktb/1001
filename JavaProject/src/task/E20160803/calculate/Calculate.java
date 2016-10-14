package task.E20160803.calculate;

public class Calculate {
	
	public static long calculate(int numLeft,int num2Right,String str){
		long result = 0;
		if (str.equals("+")) {
			result = numLeft + num2Right;
		} else if (str.equals("-")) {
			result = numLeft - num2Right;
		} else if (str.equals("*")) {
			result = numLeft * num2Right;
		} else if (str.equals("/")){
			if (num2Right != 0) {
				result = numLeft / num2Right;
			} else {
				System.out.println("除数不能为零！");
			}
		} else {
			System.out.println("运算符输入不正确！");
		}
		
		return result;
	}
}
