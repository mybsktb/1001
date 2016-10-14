package task.E20160727.task1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ����һ���ļ���������ļ���������Ϣ��ӡ������
 * ���� �ļ��� �ļ�·��  �ļ���ʽ  �ļ��޸�ʱ�� ��
 */
public class IOTask1 {

	public static void main(String[] args) throws IOException {
		//�����ļ�·�����ļ���
		String path = "d:\\test.txt";
		File file = new File(path);
		FileReader fr = new FileReader(file); 
		
		//����ļ�����
		int result = 0;
		while((result = fr.read()) != -1){
			System.out.print((char)result);
		}
		System.out.println("");
		fr.close();
		
		//����ļ���
		String tmpFileName = file.getName();
		int index = file.getName().lastIndexOf(".");
		String fileName = tmpFileName.substring(0, index);
		System.out.println("�ļ�����" + fileName);
		
		//����ļ�·��
		System.out.println("�ļ�·����" + file.getParent());
		
		//����ļ���ʽ
		String type = tmpFileName.substring(index + 1);
		System.out.println("�ļ����ͣ�" + type);
		
		//����ļ��޸�ʱ��
		System.out.println("����޸�ʱ�䣺" + transDate(file.lastModified()));
	}

	//���ڸ�ʽ��
	private static String transDate(long time){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String result = sdf.format(new Date(time)); 
		return result;
	}
}
