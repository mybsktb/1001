package task.E20160817.cylei;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringZ {
	public static void main(String[] args) {
		String str = " abcdefghi,jklmnopqrst,uvwxyz ";
		// charAt()��ȡָ��λ�õ��ַ�
		char c = str.charAt(0);
		System.out.println(c);
		// �Ƚ������ַ������,���ز���ֵ
		System.out.println(str.equals("sjdflksjld"));
		// ���ָ����ָ��ַ���
		String [] arr = str.split(",");
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		// �ַ����ĳ���
		System.out.println(str.length());
		// �����ַ������ֵĵ�һ��λ��
		System.out.println(str.indexOf(","));
		// �����ַ������ֵ����һ�ε�λ��
		System.out.println(str.lastIndexOf(","));
		// ���ַ�����ָ�����ַ����滻Ϊ�������ַ���
		String res = str.replace("abc", "aaa");
		System.out.println(res);
		// ȥ���ַ�����β�ո�
		System.out.println(str.trim());
		// ��ָ���ַ�����ʼ/����
		System.out.println(str.startsWith(" a"));
		System.out.println(str.endsWith("z "));
		// ���ַ���ת��Ϊ��д[СдtoLowerCase()]
		System.out.println(str.toUpperCase());
		// ��ȡ�ַ���
		System.out.println(str.substring(2, 10));
		System.out.println(str.substring(15));
		// �ַ��������á�+����
		System.out.println(str + "hhhhhh");
		
		// StringBuffer�÷�����String�÷�����
		// ����һ��StringBuffer����
		StringBuffer strBf = new StringBuffer("aaaa");
		System.out.println(strBf.toString());
		// ����
		System.out.println(strBf.append("bbbb").toString());
		// ����
		System.out.println(strBf.length());
		// ����
		System.out.println(strBf.insert(2, "cc"));
		// ����
		System.out.println(strBf.reverse());
		// ɾ��,����ɾ����Ľ��
		System.out.println(strBf.delete(2, 5));
		// ��ȡ
		System.out.println(strBf.substring(3));
		
		// ����
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
		
		// Math
		
		//[0,10)���������
		System.out.println((int)(Math.random()*10));
	}
}
