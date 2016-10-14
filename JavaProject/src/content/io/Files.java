package content.io;

import java.io.File;         //java.io包也是Java内置的包，其中包含一系列对文件和目录的属性进行操作，对文件进行读写操作的类；
import java.io.IOException;	 //程序中如果要使用到该包中的类，对文件或流进行操作，则必须显式地声明如下语句：import java.io.*;


public class Files
{
	public static void main(String[] args) throws IOException
	{
/*		// 文件对象File： 是文件和目录的统称； File对象并不能直接对文件进行读/写操作，只能查看文件的属性
		String path =  "e:"+File.separator+"test"+File.separator; //绝对路径;  文件分割符; 
		String file1 = "file1.txt";  //相对路径
		String file2 ="file2.txt";
		System.out.println(path);
		File file = new File(path+file1); // 这里的file指文件,绝对路径
		System.out.println("该文件创建是否成功：" + file.createNewFile()); // 创建新文件(不是目录)，但前面的目录需要事先存在
		System.out.println("该文件[目录]是否存在：" + file.exists()); // 判断文件是否存在
		System.out.println("该文件[目录]是否为文件：" + file.isFile()); // 判断该文件是否为文件
		System.out.println("该文件[目录]名：" + file.getName()); // 获取该文件[目录]的名称
		System.out.println("该文件[目录]最后修改时间：" + file.lastModified()); // 获取该文件[目录]的最后修改时间 长整型
		file.renameTo(new File(path+file2));  //文件重命名
		File dir = new File("e:\\test2\\test"); // 这里的file指目录
		System.out.println("是否成功为该文件[目录]创建一层目录：" + dir.mkdir()); // 创建新目录；只能单层，前面的目录需要事先存在
		System.out.println("是否成功为该文件[目录]级联创建目录：" + dir.mkdirs()); // 连续创建新目录；前面目录不存在时，会逐层创建
		System.out.println("该文件[目录]是否为目录：" + dir.isDirectory()); // 判断该文件是否为目录
		System.out.println("该文件[目录]的父文件信息：" + dir.getParentFile()); // 获取该文件[目录]的父文件信息【返回值是对象】
		System.out.println("该文件[目录]上层目录：" + dir.getParent()); // 获取该文件[目录]的上一层目录 【返回值是字符串】
		System.out.println("目录：" + dir.getAbsolutePath() + "下有："); // 获取该文件[目录]的绝对路径
		for (File fl : dir.listFiles()) // 列出该目录下所有的文件信息【返回对象列表】；返回File[]数组
		{
			System.out.println("      文件名：" + fl.getName());
			// fl.delete(); //删除文件
		}*/
		File file = new File("d:\\test\\");
		listAllFiles(file, 1);
	}
/*
	public static void changeFile()
	{
		File oldfile = new File("d:\\1.dat");
		File newfile = new File("d:\\2.dat");
		oldfile.renameTo(newfile); //重命名
	}
	*/
	/*
	 * 该程序表示，把某文件夹下 所有的文件 都显示出来(包括子文件夹及文件)
	 */
	public static void listAllFiles(File root, int level)
	{
		for (int i = 1; i < level; i++)
			System.out.print("       ");

		if (root.isFile())
		{
			System.out.println("文件名:" + root.getName());
		}
		else if (root.isDirectory())
		{

			System.out.println("文件夹名:" + root.getName());
			// 列出root下的所有子文件： 文件夹 或 文件
			File[] files = root.listFiles();

			for (File fs : files)
			{
				// 递归调用
				listAllFiles(fs, level + 1);
			}

		}

	}

}
