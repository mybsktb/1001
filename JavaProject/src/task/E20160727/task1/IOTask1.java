package task.E20160727.task1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 给定一个文件，输出该文件的内容信息打印出来；
 * 包括 文件名 文件路径  文件格式  文件修改时间 等
 */
public class IOTask1 {

	public static void main(String[] args) throws IOException {
		//给定文件路径和文件名
		String path = "d:\\test.txt";
		File file = new File(path);
		FileReader fr = new FileReader(file); 
		
		//输出文件内容
		int result = 0;
		while((result = fr.read()) != -1){
			System.out.print((char)result);
		}
		System.out.println("");
		fr.close();
		
		//输出文件名
		String tmpFileName = file.getName();
		int index = file.getName().lastIndexOf(".");
		String fileName = tmpFileName.substring(0, index);
		System.out.println("文件名：" + fileName);
		
		//输出文件路径
		System.out.println("文件路径：" + file.getParent());
		
		//输出文件格式
		String type = tmpFileName.substring(index + 1);
		System.out.println("文件类型：" + type);
		
		//输出文件修改时间
		System.out.println("最后修改时间：" + transDate(file.lastModified()));
	}

	//日期格式化
	private static String transDate(long time){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String result = sdf.format(new Date(time)); 
		return result;
	}
}
