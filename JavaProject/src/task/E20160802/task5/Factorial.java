package task.E20160802.task5;

import java.util.Scanner;

/**
 * 阶乘
 * 用Scanner 给定一个输入内容，如果非数值，则提示：你输入的不是数值；
 * 如果小于1，提示：你输入的数值不能小于1；
 */
public class Factorial {
	static StringBuffer strBuffer = new StringBuffer();

	public static void main(String[] args) {
		//键盘输入任意字符串
		Scanner sc = new Scanner(System.in);

		String data = sc.next();
		try {
			//类型转换String-->Float
			Float floatNum = Float.parseFloat(data);
			//得到整型值
			int num = floatNum.intValue();
			//输入小于1
			if (num < 1){
				System.out.println("你输入的数值不能小于1！");
			} else {
				//计算阶乘
				long rs = factorial(num);
				
				if (strBuffer.toString().endsWith("*")) {
					// 获取最后一个‘*’号所在的位置
					int index = strBuffer.lastIndexOf("*");
					// 删除最后一个‘*’号
					strBuffer.deleteCharAt(index);
				}
				//输出
				System.out.println(strBuffer + "=" + rs);
			}
		//输入非数字
		} catch (NumberFormatException e) {
			System.out.println("你输入的不是数值！");
		} finally {
			sc.close();
		}
	}
	
	/**
	 * 阶乘
	 * @param num
	 * @return 计算结果
	 */
	private static long factorial(int num){
		long result = 1;
		if (num > 1)
			//递归
			result = num * factorial(num-1);
		//拼接字符串
		strBuffer.append(num + "*");
		//返回结果
		return result;
	}
}
