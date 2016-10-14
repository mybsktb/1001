package task.E20160727.task3;

import java.io.File;

/**
 * ����һ���ļ������г����ļ��µ��ļ���Ϣ. ������ļ���һ���ļ���ֻ���Լ������ƣ�
 * ������ļ���һ���ļ��У���ô�г����ļ����� ����Щ�ļ� �� �ļ���
 */
public class IOTask3 {

	public static void main(String[] args) {
		File file = new File("d:\\test\\");

		// �г��ļ����µ������ļ����ļ���
		printAll(file,1);
	}


	/**
	 * �г������ļ����ļ���
	 */
	private static void printAll(File file, int ctrl) {
		if (file != null) {
			for (int i=0; i < ctrl; i++) {
				System.out.print("   ");
			}
			if (file.isDirectory()) {
				// ��ӡ���ļ�������
				System.out.println("�ļ��У�" + file.getName());
				
				//�г�Ŀ¼�������ļ����ļ���
				File[] fileArray = file.listFiles();
				if (fileArray != null) {
					for (File fl : fileArray) {
						// �ݹ�
						printAll(fl, ctrl + 1);
					}
				}
			} else {
				// ��ӡ���ļ�����
				System.out.println("�ļ���" + file.getName());
			}
		}
	}
}
