package task.E20160727.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class InAndOut {
	public static void main (String [] args) throws IOException{
		
		String path = "d:\\test.txt";
		File file = new File(path);
		
		FileInputStream fis = new FileInputStream(file);
		FileReader fr = new FileReader(file);
		
		int result = 0;
		while((result=fr.read()) != -1){
//			System.out.print(result + "\t");
			System.out.print((char)result);
		}
		fis.close();
		
//		FileOutputStream fos = new FileOutputStream(file);
//		String words = "fffffffffffff";
//		fos.write(words.getBytes());
//		
//		fos.close();
	}
}
