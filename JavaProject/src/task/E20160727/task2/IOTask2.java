package task.E20160727.task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/**
 * ����һ���ļ������ļ�ΪGBK��ʽ���������ļ����ݿ���������һ���ļ��ϣ�
 * ������ ��utf-8�ĸ�ʽ�������
 */
public class IOTask2 {

	public static void main(String[] args) throws IOException {

		// �����ļ�·�����ļ���
		//�����ļ�
		String fileFrom = "d:\\task2-1.txt";
		//����ļ�
		String fileTo = "d:\\task2-2.txt";

		//��d:\\task2-1.txt�ж�ȡ�ļ�����
		BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(fileFrom), Charset.forName("GBK")));
		//��utf-8�ĸ�ʽ��������������d:\\task2-2.txt��
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream(fileTo), Charset.forName("UTF-8")));
		
		String str = null;
		System.out.println("==========�ļ�����===========");
		while ((str = br.readLine()) != null) {
			System.out.println(str);
			bw.write(str);
			bw.newLine();
		}
		System.out.println("=============================");

		System.out.println("������ɡ�����");
		
		bw.close();
		br.close();
	}

}
