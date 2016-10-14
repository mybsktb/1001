package task.E20160802.task5;

import java.util.Scanner;

/**
 * �׳�
 * ��Scanner ����һ���������ݣ��������ֵ������ʾ��������Ĳ�����ֵ��
 * ���С��1����ʾ�����������ֵ����С��1��
 */
public class Factorial {
	static StringBuffer strBuffer = new StringBuffer();

	public static void main(String[] args) {
		//�������������ַ���
		Scanner sc = new Scanner(System.in);

		String data = sc.next();
		try {
			//����ת��String-->Float
			Float floatNum = Float.parseFloat(data);
			//�õ�����ֵ
			int num = floatNum.intValue();
			//����С��1
			if (num < 1){
				System.out.println("���������ֵ����С��1��");
			} else {
				//����׳�
				long rs = factorial(num);
				
				if (strBuffer.toString().endsWith("*")) {
					// ��ȡ���һ����*�������ڵ�λ��
					int index = strBuffer.lastIndexOf("*");
					// ɾ�����һ����*����
					strBuffer.deleteCharAt(index);
				}
				//���
				System.out.println(strBuffer + "=" + rs);
			}
		//���������
		} catch (NumberFormatException e) {
			System.out.println("������Ĳ�����ֵ��");
		} finally {
			sc.close();
		}
	}
	
	/**
	 * �׳�
	 * @param num
	 * @return ������
	 */
	private static long factorial(int num){
		long result = 1;
		if (num > 1)
			//�ݹ�
			result = num * factorial(num-1);
		//ƴ���ַ���
		strBuffer.append(num + "*");
		//���ؽ��
		return result;
	}
}
