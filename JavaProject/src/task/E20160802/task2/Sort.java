package task.E20160802.task2;

/**
 * ʹ��ð�����򷨣������������һ���ַ������� ���� ����
 */
public class Sort {

	public static void main(String[] args) {
		//�������ַ�������
		String [] str = {"101","edfe","gred","01","vafse","","zafse","sdfwera","12"};
		
		for (int i=0; i < str.length; i++) {
			for(int j=str.length-1; j>=1; j--){
				//�Ƚ��ַ�����С
				if (str[j].compareTo(str[j-1]) > 0) {
					//ֵ����
					String tmp = str[j];
					str[j] = str[j-1];
					str[j-1] = tmp;
				}
			}
		}
		System.out.println("�ַ����Ӵ�С�����ǣ�");
		//����ַ���
		for (int i=0; i <str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
