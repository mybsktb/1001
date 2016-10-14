package content.io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectFlow {
	/*
	 * �����������ڽ���Զ��ͨ��ʱ���˴˿��Է��͸������͵����ݡ������Ǻ������͵����ݣ������Զ��������е���ʽ�������ϴ��͡�
	 * ���ͷ���Ҫ�����Java����ת��Ϊ�ֽ����У������������ϴ��ͣ����շ�����Ҫ���ֽ������ٻָ�ΪJava����
	 * ������Java����ת��Ϊ�ֽ����еĹ��̳�Ϊ��������л��� �������ֽ����лָ�ΪJava����Ĺ��̳�Ϊ����ķ����л���
	 * 
	 * ��������л���Ҫ��������;�� ��
		 * ��1�� �Ѷ�����ֽ��������õر��浽Ӳ���ϣ�ͨ�������һ���ļ��У� ��
		 * ��2�� �������ϴ��Ͷ�����ֽ����С�
	 * 
	 * java.io.ObjectOutputStream������������������writeObject(Object  obj)�����ɶԲ���ָ����obj����������л����ѵõ����ֽ�����д��һ��Ŀ��������С� ����
	 * java.io.ObjectInputStream�������������������readObject()������һ��Դ�������ж�ȡ�ֽ����У��ٰ����Ƿ����л�Ϊһ�����󣬲����䷵�ء���
	 * ������ע��ֻ��ʵ����Serializable��Externalizable�ӿڵ���Ķ�����ܱ����л���
	 * Externalizable�ӿڼ̳���Serializable�ӿڣ�
	 * ʵ��Externalizable�ӿڵ�����ȫ���������������л�����Ϊ������ʵ��Serializable�ӿڵ�����Բ���Ĭ�ϵ����л���ʽ ��
	 * 
	 * ����  �������л��������²��裺 ����
			 * 1�� ����һ������������������԰�װһ���������͵�Ŀ������������ļ�������� ����
			 * 2�� ͨ�������������writeObject()����д���� ����
	 *   �������л��Ĳ������£� ����
			 * 1�� ����һ�������������������԰�װһ���������͵�Դ�����������ļ��������� ��
			 * 2�� ͨ��������������readObject()������ȡ����
	 */

	public static void main(String[] args) {
		//serize();
		noSerize();
	}
	
	/**
	 * �������л�
	 */
	public static void serize(){
		Student s1 = new Student(1,"��1",18,new Book(1,"���μ�"));
		Student s2 = new Student(2,"��2",28,new Book(2,"��ƿ÷"));
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream("e:\\1.dat"));
			oos.writeObject(s1);
			oos.writeObject(s2);
			oos.close();
			System.out.println("����ɹ���");
		} catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("����ʧ�ܣ�");
		}
	}
	
	/**
	 * �������л�
	 */
	public static void noSerize(){
		//1 ֻ���� Object��
				//2 ֻ��һֱ��
				ObjectInputStream ois;
				try {
					ois = new ObjectInputStream(new FileInputStream("e:\\1.dat"));
				} catch (Exception e) 
				{
					e.printStackTrace();
					return;
				}
				
				while(true)  //���϶���
				{
					try {
						Object obj = ois.readObject();
						System.out.print("��ȡ������:"+obj.getClass().getName()+"�Ķ���");
						System.out.println(obj);
					}catch(EOFException e)
					{
						System.out.println("��ȡ���!");//ֱ���쳣˵����ȡ��ϡ�
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
		return sid+"---"+name+"---"+age+"  ��ӵ�е�����:"+book.getName();
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
