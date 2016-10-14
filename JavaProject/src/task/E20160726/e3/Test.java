package task.E20160726.e3;

public class Test {

	public static void main(String[] args) {
		EStringSp es = new EStringSp();
		String str = "1,2,3,-5,8,3,10";
		//分割字符串
		String [] tmp = es.divString(str);
		int sum = 0;
		//对字符串中的数字进行求和
		for (int i=0; i<tmp.length; i++) {
			String s = tmp[i];
			int k = Integer.parseInt(s);
			System.out.println("数字：" + k);
			sum += k;
		}
		//输出求和结果
		System.out.println("和：" + sum);
	}

}
