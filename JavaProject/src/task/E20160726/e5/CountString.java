package task.E20160726.e5;

public class CountString {
	
	public static void main(String[] args) {
		String aa = "baaahfhjiabhfsduishiabab";
		String bb = "z";
		
		System.out.println(count(aa, bb));
		System.out.println(countA(aa, bb));
	}
	
	/**
	 * count
	 */
	public static int countA(String source, String sub){
		int count = 0;
		while(source.indexOf(sub) != -1){
			source = source.substring(source.indexOf(sub) + sub.length());
			count++;
		}
		return count;
	}
	
	/**
	 * 计数
	 */
	public static int count(String source, String sub){
		//计数
		int count = 0;
		//
		int tmp = 0;
		char [] str = source.toCharArray();
		char [] ss = sub.toCharArray();
		
		for (int index = 0; index < str.length;) {
			boolean flg = false;
			for (int j = 0; j < ss.length; j++) {
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
		
		return count;
	}
}
