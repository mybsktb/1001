package com.mc.utils;

import com.mc.common.Const;

public class StringUtil {
	
	/**
	 * 判断字符串是否为null，空格，""空字符串
	 * @param str
	 * @return 
	 */
	public static boolean isEmpty(String str){
		return str == null || Const.EMPTY.equals(str.trim());
	}
	
	/**
	 * String转int
	 * @param str
	 * @return
	 */
	public static int stringToInt(String str){
		int integer = -1;
		try{
			integer = Integer.parseInt(str);
		} catch (NumberFormatException e){
			System.out.println("数�?�转换异常！�?");
		}
		return integer;
	}
}
