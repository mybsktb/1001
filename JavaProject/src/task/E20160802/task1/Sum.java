package task.E20160802.task1;

/**
 * ��20�������в��ܱ�2 ��3 �����������ܺ�ֵ�� Ҫ�����������ƣ�
 * 1+5+7+11.. = �ܺ�ֵ
 */
public class Sum {
	public static final int NUM = 20;
	public static void main(String[] args) {
		//��
		int sum = 0;
		StringBuffer strBuffer = new StringBuffer();
		//���÷�Χ20����
		for (int i=1; i<=NUM; i++) {
			if (!(i%2 == 0) && !(i%3 == 0)) {
				//׷��
				strBuffer.append( i + "+");
				//���
				sum += i;
			}
		}
		//��ȡ���һ����+�������ڵ�λ��
//		int index = strBuffer.lastIndexOf("+");
		//ȥ��+����
		if(strBuffer.toString().endsWith("+")){
			//ɾ�����һ����+����
			strBuffer.deleteCharAt(strBuffer.lastIndexOf("+"));
		}
		//������
		System.out.println(strBuffer + " = " + sum);
	}

}
