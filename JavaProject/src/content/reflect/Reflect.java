package content.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflect {
	private String name; 
	public String words; 
	protected int age; 
	
	
	
	public  void mainR() throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
		
		//1. ��ȡ Class ����
		//(1) ����.class
		Class<Reflect> c = Reflect.class;
		//(2). ����.getClass()
		Reflect re = new Reflect();
		Class<? extends Reflect> c1 = re.getClass();
		
		//(3). ����·�� �� Class
		Class<?> c2 = null;
		try {
			 c2 = Class.forName("content.reflect.Reflect");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("c1:"+c1);
		System.out.println("c2:"+c2);
		
		Reflect  resss = new Reflect();
		resss.setName("����...");
		
		//��2�� ��ȡ       ����     ����        ���췽��       ��   ע��
		  // ���� ��  ˽��  protected public
		Field res = c2.getField("words");
		String result =  (String)res.get(resss);
		
		System.out.println("���Ե�ֵ��:"+result);
		
		//��3����ȡ   ����   
		Method mth =  c2.getMethod("speak",String.class);
		mth.invoke(resss);
	}
	
	
	public void speak(){
		System.out.println("name:" + this.name);
	}
	public void speak(String name){
		this.name = name;
		System.out.println("name: " + this.name);
	}

	public void speak (String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("name:" + this.name + "  age:" + this.age);
	}
	
	private void run(){
		System.out.println("˽�еķ���");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWords() {
		return words;
	}

	public void setWords(String words) {
		this.words = words;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
