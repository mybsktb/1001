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
 * 给定一个文件（该文件为GBK格式），将该文件内容拷贝到另外一个文件上，
 * 但内容 以utf-8的格式进行输出
 */
public class IOTask2 {

	public static void main(String[] args) throws IOException {

		// 给定文件路径和文件名
		//输入文件
		String fileFrom = "d:\\task2-1.txt";
		//输出文件
		String fileTo = "d:\\task2-2.txt";

		//从d:\\task2-1.txt中读取文件内容
		BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(fileFrom), Charset.forName("GBK")));
		//以utf-8的格式进行输出，输出到d:\\task2-2.txt中
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream(fileTo), Charset.forName("UTF-8")));
		
		String str = null;
		System.out.println("==========文件内容===========");
		while ((str = br.readLine()) != null) {
			System.out.println(str);
			bw.write(str);
			bw.newLine();
		}
		System.out.println("=============================");

		System.out.println("处理完成。。。");
		
		bw.close();
		br.close();
	}

}
