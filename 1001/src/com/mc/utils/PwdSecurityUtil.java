package com.mc.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5加密
 */
public class PwdSecurityUtil {
	private static int num = 1;
	/**
	 * MD5加密
	 * @param str 要加密的字符�?
	 * @param count 加密循环次数
	 * @return 加密结果
	 */
	public static String transMd5(String str,int count){
		char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}; 
		try {
			// 获取MessageDigest的实�?
			MessageDigest md = MessageDigest.getInstance("MD5");
			// 更新摘要
			md.update(str.getBytes());
			// 获得密文
			byte[] b = md.digest();
			// 把密文转换成十六进制的字符串形式
			int a = 0;
			char str1[] = new char[b.length * 2];
			for(byte byte0 : b){
                str1[a++] = hexDigits[byte0 >>> 4 & 0xf];
                str1[a++] = hexDigits[byte0 & 0xf];
			}
			str = new String(str1);
			System.out.println("�?" + num + "次加密结果： "+str);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		num++;
		// 加密count次跳�?
		if(num<=count){
			// 递归
			str = transMd5(str,count);
		}
		num=0;
		return str;
	}
	
	public static void main(String[] args) {
		transMd5("1234",5);
	}
}
