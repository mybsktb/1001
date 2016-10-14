package content.io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectFlow {
	/*
	 * 当两个进程在进行远程通信时，彼此可以发送各种类型的数据。无论是何种类型的数据，都会以二进制序列的形式在网络上传送。
	 * 发送方需要把这个Java对象转换为字节序列，才能在网络上传送；接收方则需要把字节序列再恢复为Java对象。
	 * 　　把Java对象转换为字节序列的过程称为对象的序列化。 　　把字节序列恢复为Java对象的过程称为对象的反序列化。
	 * 
	 * 对象的序列化主要有两种用途： 　
		 * 　1） 把对象的字节序列永久地保存到硬盘上，通常存放在一个文件中； 　
		 * 　2） 在网络上传送对象的字节序列。
	 * 
	 * java.io.ObjectOutputStream代表对象输出流，它的writeObject(Object  obj)方法可对参数指定的obj对象进行序列化，把得到的字节序列写到一个目标输出流中。 　　
	 * java.io.ObjectInputStream代表对象输入流，它的readObject()方法从一个源输入流中读取字节序列，再把它们反序列化为一个对象，并将其返回。、
	 * 　　【注】只有实现了Serializable和Externalizable接口的类的对象才能被序列化。
	 * Externalizable接口继承自Serializable接口，
	 * 实现Externalizable接口的类完全由自身来控制序列化的行为，而仅实现Serializable接口的类可以采用默认的序列化方式 。
	 * 
	 * 　　  对象序列化包括如下步骤： 　　
			 * 1） 创建一个对象输出流，它可以包装一个其他类型的目标输出流，如文件输出流； 　　
			 * 2） 通过对象输出流的writeObject()方法写对象。 　　
	 *   对象反序列化的步骤如下： 　　
			 * 1） 创建一个对象输入流，它可以包装一个其他类型的源输入流，如文件输入流； 　
			 * 2） 通过对象输入流的readObject()方法读取对象。
	 */

	public static void main(String[] args) {
		//serize();
		noSerize();
	}
	
	/**
	 * 对象序列化
	 */
	public static void serize(){
		Student s1 = new Student(1,"白1",18,new Book(1,"西游记"));
		Student s2 = new Student(2,"白2",28,new Book(2,"金瓶梅"));
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream("e:\\1.dat"));
			oos.writeObject(s1);
			oos.writeObject(s2);
			oos.close();
			System.out.println("保存成功！");
		} catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("保存失败！");
		}
	}
	
	/**
	 * 对象反序列化
	 */
	public static void noSerize(){
		//1 只能用 Object类
				//2 只能一直读
				ObjectInputStream ois;
				try {
					ois = new ObjectInputStream(new FileInputStream("e:\\1.dat"));
				} catch (Exception e) 
				{
					e.printStackTrace();
					return;
				}
				
				while(true)  //不断读，
				{
					try {
						Object obj = ois.readObject();
						System.out.print("读取到的是:"+obj.getClass().getName()+"的对象：");
						System.out.println(obj);
					}catch(EOFException e)
					{
						System.out.println("读取完毕!");//直到异常说明读取完毕。
						break;
					}
					catch (Exception e) 
					{
						e.printStackTrace();
						break;
					}			
				}
				
				try 
				{
					ois.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
	}
	
}


class Student implements Serializable 
{
	private int sid;
	private String name;
	private int age;
	private Book book;
	
	
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(int sid, String name, int age,Book book) 
	{
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
		this.book = book;
	}
	
	@Override
	public String toString() 
	{	
		return sid+"---"+name+"---"+age+"  所拥有的书名:"+book.getName();
	}
		
}

class Book implements Serializable
{
	private int bid;
	private String name;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Book(int bid, String name) {
		super();
		this.bid = bid;
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bid+"--"+name;
	}
}
