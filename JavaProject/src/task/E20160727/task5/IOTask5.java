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
 * 给定一个文件的目录： 要求把该目录（该目录或许有很多层子目录）下
 * 所有 *.java的文件都从 UTF-8的格式转换为 GBK格式
 * 【目标】综合应用io流知识
 */
public class IOTask5 {
	public static final String UTF8 = "UTF-8";
	public static final String GBK = "GBK";
	private static List<File> filesStatic = new ArrayList<File>();

	public static void main(String[] args) throws IOException{
		//给定一个目录
		File path = new File("d:\\test\\");
		String fileType = ".java";
		
		//获取该目录下的所有 .java文件
		List<File> files = getFiles(path, fileType);
		//将获取的文件从UTF-8的格式转换为GBK格式
		if (files != null){
			for (File fl : files) {
				//临时文件
				File tmpFile = new File(fl.getParent() + "\\tmpFile"+ fileType);
				if (!tmpFile.exists()) {
					//创建临时文件
					tmpFile.createNewFile();
				} else {
					System.out.println("文件已存在。。。");
				}
				//借助临时文件进行格式转换
				transFormat(fl, tmpFile, UTF8, GBK);
				fl.delete();
				tmpFile.renameTo(fl);
			}
		}
	}
	
	/**
	 * 获取指定目录下的指定类型的文件
	 * @param dir 目录
	 * @param str 指定类型  “.java”
	 * @return 文件数组
	 */
	private static List<File> getFiles(File dir,String str){
		//获取指定目录下的所有文件
		File [] fileArray = dir.listFiles();
		
		if (fileArray == null) return null;

		//遍历
		for (File file : fileArray) {
			if (file.getName().toString().endsWith(str)) {
				
				//获取指定类型文件
				if (file.isFile()){
					filesStatic.add(file);
					System.out.println(file.getName());
				}
			}
			//递归
			getFiles(file, str);
		}
		//返回得到的文件数组
		return filesStatic;
	}
	
	/**
	 * 将fl的文件内容按给定的格式写入fl2文件
	 * @param fl 给定的文件
	 * @param fl2 要写入的文件
	 * @param charSetBefore 转换前格式
	 * @param charSetAfter 转换后格式
	 * @throws IOException
	 */
	private static void transFormat(File fl, File fl2, String charSetBefore, String charSetAfter)
 throws IOException {

		// if (codedFormat(fl) == UTF8){
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fl), charSetBefore));

		// 以给定的格式创建
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fl2), charSetAfter));

		// 打印文件 内容
		String str = null;

		// 逐行读取
		while ((str = br.readLine()) != null) {
			// 写入
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
				System.out.println(file.getName() + "：编码为UTF-8");
				return UTF8;
			} else{
				System.out.println(file.getName() + "：可能是GBK，也可能是其他编码");
				return GBK;
			}
		}
		
		return codedFormat;
	}*/
}
