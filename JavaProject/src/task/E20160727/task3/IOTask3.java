package task.E20160727.task3;

import java.io.File;

/**
 * 给定一个文件：罗列出该文件下的文件信息. 如果该文件是一个文件，只列自己的名称；
 * 如果该文件是一个文件夹，那么列出该文件夹下 有哪些文件 及 文件夹
 */
public class IOTask3 {

	public static void main(String[] args) {
		File file = new File("d:\\test\\");

		// 列出文件夹下的所有文件和文件夹
		printAll(file,1);
	}


	/**
	 * 列出所有文件或文件夹
	 */
	private static void printAll(File file, int ctrl) {
		if (file != null) {
			for (int i=0; i < ctrl; i++) {
				System.out.print("   ");
			}
			if (file.isDirectory()) {
				// 打印出文件夹名称
				System.out.println("文件夹：" + file.getName());
				
				//列出目录下所有文件或文件夹
				File[] fileArray = file.listFiles();
				if (fileArray != null) {
					for (File fl : fileArray) {
						// 递归
						printAll(fl, ctrl + 1);
					}
				}
			} else {
				// 打印出文件名称
				System.out.println("文件：" + file.getName());
			}
		}
	}
}
