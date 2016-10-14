package content.string;


public class StringObj
{
	/*
		1. 涓洪槻姝㈣缁ф壙锛孲tring绫�  涓篺inal鍨�
			String 鐨勭洿鎺ラ噺鏄瓨鏀惧湪甯搁噺姹犱腑锛屾墍浠ヤ竴鏃﹀畾涔夊氨涓嶈兘鏀瑰彉鍊硷紱 瀹冩槸涓嶅彲鍙樼殑瀛楃搴忓垪
			
		2. String 鍒濆鍖�
			 String str = new String(鈥渉ello鈥�);  		//涓�鍏辨湁涓や釜瀵硅薄锛屽湪鏍堝拰鍫嗗唴瀛樹腑鍚勬湁涓�涓�
			 String (byte[] arr )   					//浣跨敤涓�涓瓧鑺傛暟缁刟rr鍒涘缓涓�涓瓧绗︿覆瀵硅薄
			 String(char[]  arr)
			 String(char[] arr,int startIndex ,int count)	 
		 
		3. 甯哥敤鏂规硶  銆愬繀椤绘帉鎻★紝閲嶇偣銆�
			length()     			   trim()
			equals(Object s)           equalsIgnoreCase(String s)
			substring(int b);          replace(String old ,String new);
			compareTo(String s )       compareToIgnoreCase(String s)
			startWith(String prefix)   endsWith(String suffix)  
			toUpperCase() 			   toLowerCase() 
			indexOf(String s)          charAt(int index) 
			split(String s)
			isEmpty()
			鈥�
	*/
	
	public static void main(String[] args) {
		 
		  
		//濡備綍琛ㄧず 涓や釜瀛楃涓茬浉绛夛紵
		/*String name = "浣犲ソ";
		String name1 = "浣犲ソ";
		String name2 = new String("浣犲ソ"); //鍙鏄敤new()鏉ユ柊寤哄璞＄殑锛岄兘浼氬湪鍫嗕腑鍒涘缓锛岃�屼笖鍏跺瓧绗︿覆鏄崟鐙瓨鍊肩殑锛屽嵆浣夸笌鏍堜腑鐨勬暟鎹浉鍚岋紝涔熶笉浼氫笌鏍堜腑鐨勬暟鎹叡浜��
		
		if(name == name1) //灏介噺涓嶈鐢ㄦ鏂规硶 鏉ユ瘮杈冧袱瀛楃涓茬浉绛夈�� 璇︽儏璇风湅
		{
			System.out.println("涓ゅ瓧绗︿覆鐩稿悓鍚楋紵");
		}
		
		if(name2 == name1) //杩斿洖false銆� 璇︽儏璇风湅  java鍫嗘爤  鐭ヨ瘑鐐�
		{
			System.out.println("name2鍜宯ame1鐩哥瓑");
		}
		
		if(name == "浣犲ソ")  //鍥犱负鐗╃悊鍦板潃鐩哥瓑
		{
			System.out.println("杩欐槸鐩哥瓑鐨�...");
		}
		
		if(name1.equals(name)){ //瀛楃涓茬浉绛夊垽鏂紝搴旂敤equals
			System.out.println("鍚嶅瓧鐩稿悓");
		}
		
		String aaa = "aaaDCwfwef";
		 aaa.replace("wf", "wefs");
		 System.out.println(aaa);//杩欐槸涓櫡闃� 寰堝鏄撳嚭閿欙紒锛�
		 */	
		
		/*length()     			   trim()
		equals(Object s)           equalsIgnoreCase(String s)
		substring(int b);          replace(String old ,String new);
		compareTo(String s )       compareToIgnoreCase(String s)
		startWith(String prefix)   endsWith(String suffix)  
		toUpperCase() 			   toLowerCase() 
		indexOf(String s)          charAt(int index) 
		split(String s)
		isEmpty()*/
//		String as = "aac鑼冩枃鑺�  asb sfwefwef  " ;
//		String ad = "aabdf璁块棶鏈嶅姟璁块棶";
		StringBuffer ss = new StringBuffer();
		ss.append("asdhasdhfjshdfkj");
		ss.reverse();
		
		System.out.println(ss);
//		String words = "1|2|3" ; 
//		String[] wordsResult = words.split("\\|");
//		System.out.println("瀛楃涓茬殑闀垮害鏄細"+ as.length());
//		System.out.println("鍘绘帀宸﹀彸绌烘牸锛�"+as.trim());
//		System.out.println("鍙栧瓙瀛楃涓诧細(浠�1寮�濮�..缁撴潫)"+as.substring(1));
//		System.out.println("鍙栧瓙瀛楃涓诧細"+as.substring(1, 5));
//		System.out.println("鏇挎崲replace锛�"+as.replace("鑼冩枃鑺�", "fanwenfang"));
//		System.out.println("姣旇緝锛�"+as.compareTo(ad)); // -1 灏�  0 鐩哥瓑  1 澶�
//		System.out.println("鏄惁浠X寮�澶�:"+as.startsWith("aa"));
//		System.out.println("鏀瑰彉澶у皬鍐欙細"+as.toUpperCase());
//		System.out.println("绫讳技瀛楃涓插湪绗竴娆″嚭鐜扮殑浣嶇疆:"+as.indexOf("we"));
//		System.out.println("绫讳技瀛楃涓插湪绗竴娆″嚭鐜扮殑浣嶇疆锛�"+as.indexOf("we", 15));
//		System.out.println("绫讳技瀛楃涓插湪鏈�鍚庝竴娆″嚭鐜扮殑浣嶇疆:"+as.lastIndexOf("we"));
//		System.out.println("鎸囧畾绱㈠紩澶勭殑 char 鍊�:"+as.charAt(3));
//		System.out.println("鏄惁涓虹┖"+as.isEmpty());
	}
}
