package task.E20160726.e3;

public class Test {

	public static void main(String[] args) {
		EStringSp es = new EStringSp();
		String str = "1,2,3,-5,8,3,10";
		//�ָ��ַ���
		String [] tmp = es.divString(str);
		int sum = 0;
		//���ַ����е����ֽ������
		for (int i=0; i<tmp.length; i++) {
			String s = tmp[i];
			int k = Integer.parseInt(s);
			System.out.println("���֣�" + k);
			sum += k;
		}
		//�����ͽ��
		System.out.println("�ͣ�" + sum);
	}

}
