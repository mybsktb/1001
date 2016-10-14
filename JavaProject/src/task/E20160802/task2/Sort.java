package task.E20160802.task2;

/**
 * 使用冒泡排序法，对任意给定的一个字符串数组 进行 排序
 */
public class Sort {

	public static void main(String[] args) {
		//给定的字符串数组
		String [] str = {"101","edfe","gred","01","vafse","","zafse","sdfwera","12"};
		
		for (int i=0; i < str.length; i++) {
			for(int j=str.length-1; j>=1; j--){
				//比较字符串大小
				if (str[j].compareTo(str[j-1]) > 0) {
					//值交换
					String tmp = str[j];
					str[j] = str[j-1];
					str[j-1] = tmp;
				}
			}
		}
		System.out.println("字符串从大到小依次是：");
		//输出字符串
		for (int i=0; i <str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
