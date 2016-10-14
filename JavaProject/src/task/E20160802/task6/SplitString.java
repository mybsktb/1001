package task.E20160802.task6;

/**
 * ����һ���ַ��� ����һ�����ַ����� Ҫ����������ַ������ֵĴ�����
 * ���� �����ַ��� ȫ���滻Ϊ | ����Ϊ���ַ��������
 * ����ٰ����ַ�������|Ϊ��ȡ�ַ�����ò�����������ַ�������
 */
public class SplitString {

	public static void main(String[] args) {
		//�����ַ���
		String str = "sdhfiuahidhfaheihfurnhfeojnr";
		//���ַ���
		String subStr = "hf";
		//�������ַ������ֵĴ���
		int num = count(str, subStr);
		System.out.println("���ַ������ֵĴ���Ϊ��" + num + "��");
		//���ַ��� ȫ���滻Ϊ | 
		String strAfterReplace = str.replace(subStr, "|");
		//������ַ���
		System.out.println("�滻����ַ�����" + strAfterReplace);
		//��|Ϊ��ȡ�ַ�
		String [] strArray = strAfterReplace.split("\\|");
		//����������ַ�������
		System.out.print("�������ַ������ݣ�");
		for (int i=0; i<strArray.length; i++) {
			System.out.print(strArray[i] + " ");
		}
	}
	
	/**
	 * һ���ַ������и������ַ����ĸ���
	 */
	private static int count(String source, String sub){
		//����
		int count = 0;
		int tmp = 0;
		//ת�����ַ�����
		char [] str = source.toCharArray();
		char [] ss = sub.toCharArray();
		
		for (int index = 0; index < str.length;) {
			boolean flg = false;
			for (int j = 0; j < ss.length; j++) {
				//��¼��ǰ�±�
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
		//����ͳ����ֵ
		return count;
	}
}
