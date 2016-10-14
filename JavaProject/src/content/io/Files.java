package content.io;

import java.io.File;         //java.io��Ҳ��Java���õİ������а���һϵ�ж��ļ���Ŀ¼�����Խ��в��������ļ����ж�д�������ࣻ
import java.io.IOException;	 //���������Ҫʹ�õ��ð��е��࣬���ļ��������в������������ʽ������������䣺import java.io.*;


public class Files
{
	public static void main(String[] args) throws IOException
	{
/*		// �ļ�����File�� ���ļ���Ŀ¼��ͳ�ƣ� File���󲢲���ֱ�Ӷ��ļ����ж�/д������ֻ�ܲ鿴�ļ�������
		String path =  "e:"+File.separator+"test"+File.separator; //����·��;  �ļ��ָ��; 
		String file1 = "file1.txt";  //���·��
		String file2 ="file2.txt";
		System.out.println(path);
		File file = new File(path+file1); // �����fileָ�ļ�,����·��
		System.out.println("���ļ������Ƿ�ɹ���" + file.createNewFile()); // �������ļ�(����Ŀ¼)����ǰ���Ŀ¼��Ҫ���ȴ���
		System.out.println("���ļ�[Ŀ¼]�Ƿ���ڣ�" + file.exists()); // �ж��ļ��Ƿ����
		System.out.println("���ļ�[Ŀ¼]�Ƿ�Ϊ�ļ���" + file.isFile()); // �жϸ��ļ��Ƿ�Ϊ�ļ�
		System.out.println("���ļ�[Ŀ¼]����" + file.getName()); // ��ȡ���ļ�[Ŀ¼]������
		System.out.println("���ļ�[Ŀ¼]����޸�ʱ�䣺" + file.lastModified()); // ��ȡ���ļ�[Ŀ¼]������޸�ʱ�� ������
		file.renameTo(new File(path+file2));  //�ļ�������
		File dir = new File("e:\\test2\\test"); // �����fileָĿ¼
		System.out.println("�Ƿ�ɹ�Ϊ���ļ�[Ŀ¼]����һ��Ŀ¼��" + dir.mkdir()); // ������Ŀ¼��ֻ�ܵ��㣬ǰ���Ŀ¼��Ҫ���ȴ���
		System.out.println("�Ƿ�ɹ�Ϊ���ļ�[Ŀ¼]��������Ŀ¼��" + dir.mkdirs()); // ����������Ŀ¼��ǰ��Ŀ¼������ʱ������㴴��
		System.out.println("���ļ�[Ŀ¼]�Ƿ�ΪĿ¼��" + dir.isDirectory()); // �жϸ��ļ��Ƿ�ΪĿ¼
		System.out.println("���ļ�[Ŀ¼]�ĸ��ļ���Ϣ��" + dir.getParentFile()); // ��ȡ���ļ�[Ŀ¼]�ĸ��ļ���Ϣ������ֵ�Ƕ���
		System.out.println("���ļ�[Ŀ¼]�ϲ�Ŀ¼��" + dir.getParent()); // ��ȡ���ļ�[Ŀ¼]����һ��Ŀ¼ ������ֵ���ַ�����
		System.out.println("Ŀ¼��" + dir.getAbsolutePath() + "���У�"); // ��ȡ���ļ�[Ŀ¼]�ľ���·��
		for (File fl : dir.listFiles()) // �г���Ŀ¼�����е��ļ���Ϣ�����ض����б�������File[]����
		{
			System.out.println("      �ļ�����" + fl.getName());
			// fl.delete(); //ɾ���ļ�
		}*/
		File file = new File("d:\\test\\");
		listAllFiles(file, 1);
	}
/*
	public static void changeFile()
	{
		File oldfile = new File("d:\\1.dat");
		File newfile = new File("d:\\2.dat");
		oldfile.renameTo(newfile); //������
	}
	*/
	/*
	 * �ó����ʾ����ĳ�ļ����� ���е��ļ� ����ʾ����(�������ļ��м��ļ�)
	 */
	public static void listAllFiles(File root, int level)
	{
		for (int i = 1; i < level; i++)
			System.out.print("       ");

		if (root.isFile())
		{
			System.out.println("�ļ���:" + root.getName());
		}
		else if (root.isDirectory())
		{

			System.out.println("�ļ�����:" + root.getName());
			// �г�root�µ��������ļ��� �ļ��� �� �ļ�
			File[] files = root.listFiles();

			for (File fs : files)
			{
				// �ݹ����
				listAllFiles(fs, level + 1);
			}

		}

	}

}
