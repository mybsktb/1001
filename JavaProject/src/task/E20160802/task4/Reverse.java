package task.E20160802.task4;

/**
 * ����һ���ַ�����Ȼ���Ե������ʽ���
 *
 */
public class Reverse {

	public static void main(String[] args) {
		//����һ���ַ���
		String str = "qwertyuiop";
		//�½�StringBuffer����
		StringBuffer sbf = new StringBuffer();
		//����ַ���
		sbf.append(str);
		//����
		StringBuffer temp = sbf.reverse();
		//���
		System.out.println(temp.toString());
	}
}
