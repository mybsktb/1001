package task.E20160727.task5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * ����һ���ļ���Ŀ¼�� Ҫ��Ѹ�Ŀ¼����Ŀ¼�����кܶ����Ŀ¼����
 * ���� *.java���ļ����� UTF-8�ĸ�ʽת��Ϊ GBK��ʽ
 * ��Ŀ�꡿�ۺ�Ӧ��io��֪ʶ
 */
public class IOTask5 {
	public static final String UTF8 = "UTF-8";
	public static final String GBK = "GBK";
	private static List<File> filesStatic = new ArrayList<File>();

	public static void main(String[] args) throws IOException{
		//����һ��Ŀ¼
		File path = new File("d:\\test\\");
		String fileType = ".java";
		
		//��ȡ��Ŀ¼�µ����� .java�ļ�
		List<File> files = getFiles(path, fileType);
		//����ȡ���ļ���UTF-8�ĸ�ʽת��ΪGBK��ʽ
		if (files != null){
			for (File fl : files) {
				//��ʱ�ļ�
				File tmpFile = new File(fl.getParent() + "\\tmpFile"+ fileType);
				if (!tmpFile.exists()) {
					//������ʱ�ļ�
					tmpFile.createNewFile();
				} else {
					System.out.println("�ļ��Ѵ��ڡ�����");
				}
				//������ʱ�ļ����и�ʽת��
				transFormat(fl, tmpFile, UTF8, GBK);
				fl.delete();
				tmpFile.renameTo(fl);
			}
		}
	}
	
	/**
	 * ��ȡָ��Ŀ¼�µ�ָ�����͵��ļ�
	 * @param dir Ŀ¼
	 * @param str ָ������  ��.java��
	 * @return �ļ�����
	 */
	private static List<File> getFiles(File dir,String str){
		//��ȡָ��Ŀ¼�µ������ļ�
		File [] fileArray = dir.listFiles();
		
		if (fileArray == null) return null;

		//����
		for (File file : fileArray) {
			if (file.getName().toString().endsWith(str)) {
				
				//��ȡָ�������ļ�
				if (file.isFile()){
					filesStatic.add(file);
					System.out.println(file.getName());
				}
			}
			//�ݹ�
			getFiles(file, str);
		}
		//���صõ����ļ�����
		return filesStatic;
	}
	
	/**
	 * ��fl���ļ����ݰ������ĸ�ʽд��fl2�ļ�
	 * @param fl �������ļ�
	 * @param fl2 Ҫд����ļ�
	 * @param charSetBefore ת��ǰ��ʽ
	 * @param charSetAfter ת�����ʽ
	 * @throws IOException
	 */
	private static void transFormat(File fl, File fl2, String charSetBefore, String charSetAfter)
 throws IOException {

		// if (codedFormat(fl) == UTF8){
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fl), charSetBefore));

		// �Ը����ĸ�ʽ����
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fl2), charSetAfter));

		// ��ӡ�ļ� ����
		String str = null;

		// ���ж�ȡ
		while ((str = br.readLine()) != null) {
			// д��
			bw.write(str);
			bw.newLine();
		}

		bw.flush();
		bw.close();
		br.close();
		// }
	}
	
/*	private static String codedFormat(File file) throws IOException{
		String codedFormat = null;
		if (file.exists()){
			InputStream in = new FileInputStream(file);
			byte [] b = new byte[3];
			
			in.read(b);
			in.close();
			
			if (b[0] == -17 && b[1] == -69 && b[2] == -65){
				System.out.println(file.getName() + "������ΪUTF-8");
				return UTF8;
			} else{
				System.out.println(file.getName() + "��������GBK��Ҳ��������������");
				return GBK;
			}
		}
		
		return codedFormat;
	}*/
}
