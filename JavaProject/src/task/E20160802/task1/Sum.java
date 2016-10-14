package task.E20160802.task1;

/**
 * 求20以内所有不能被2 和3 整除的数的总和值； 要求输出结果类似：
 * 1+5+7+11.. = 总和值
 */
public class Sum {
	public static final int NUM = 20;
	public static void main(String[] args) {
		//和
		int sum = 0;
		StringBuffer strBuffer = new StringBuffer();
		//设置范围20以内
		for (int i=1; i<=NUM; i++) {
			if (!(i%2 == 0) && !(i%3 == 0)) {
				//追加
				strBuffer.append( i + "+");
				//求和
				sum += i;
			}
		}
		//获取最后一个‘+’号所在的位置
//		int index = strBuffer.lastIndexOf("+");
		//去‘+’号
		if(strBuffer.toString().endsWith("+")){
			//删除最后一个‘+’号
			strBuffer.deleteCharAt(strBuffer.lastIndexOf("+"));
		}
		//输出结果
		System.out.println(strBuffer + " = " + sum);
	}

}
