package task.E20160802.task6;

/**
 * 给定一个字符串 ，和一个子字符串； 要求输出该子字符串出现的次数，
 * 并把 该子字符串 全都替换为 | 后作为新字符串输出，
 * 最后，再把新字符串，以|为截取字符，获得并输出所有子字符串内容
 */
public class SplitString {

	public static void main(String[] args) {
		//给定字符串
		String str = "sdhfiuahidhfaheihfurnhfeojnr";
		//子字符串
		String subStr = "hf";
		//计算子字符串出现的次数
		int num = count(str, subStr);
		System.out.println("子字符串出现的次数为：" + num + "次");
		//子字符串 全都替换为 | 
		String strAfterReplace = str.replace(subStr, "|");
		//输出新字符串
		System.out.println("替换后的字符串：" + strAfterReplace);
		//以|为截取字符
		String [] strArray = strAfterReplace.split("\\|");
		//输出所有子字符串内容
		System.out.print("所有子字符串内容：");
		for (int i=0; i<strArray.length; i++) {
			System.out.print(strArray[i] + " ");
		}
	}
	
	/**
	 * 一个字符串含有给定子字符串的个数
	 */
	private static int count(String source, String sub){
		//计数
		int count = 0;
		int tmp = 0;
		//转换成字符数组
		char [] str = source.toCharArray();
		char [] ss = sub.toCharArray();
		
		for (int index = 0; index < str.length;) {
			boolean flg = false;
			for (int j = 0; j < ss.length; j++) {
				//记录当前下标
				tmp = index;
				if (index < str.length){
					if (str[index] == ss[j]){
						flg = true;
						index++;
					} else {
						flg = false;
						index = tmp + 1;
						break;
					}
				}
			}
			if (flg) {
				count++;
				index = tmp + ss.length;
			}
		}
		//返回统计数值
		return count;
	}
}
