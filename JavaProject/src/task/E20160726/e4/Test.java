package task.E20160726.e4;

public class Test {

	public static void main(String[] args) {
		EStringLk es = new EStringLk();
		String [] str = {"张三","李四","王五","麻子","粽子"};
		//字符串拼接
		String s = es.add(str);
		//输出拼接后的字符串
		System.out.println(s);
	}

}
