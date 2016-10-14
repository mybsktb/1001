package task.E20160802.task4;

/**
 * 给定一个字符串，然后以倒序的形式输出
 *
 */
public class Reverse {

	public static void main(String[] args) {
		//给定一个字符串
		String str = "qwertyuiop";
		//新建StringBuffer对象
		StringBuffer sbf = new StringBuffer();
		//添加字符串
		sbf.append(str);
		//倒序
		StringBuffer temp = sbf.reverse();
		//输出
		System.out.println(temp.toString());
	}
}
