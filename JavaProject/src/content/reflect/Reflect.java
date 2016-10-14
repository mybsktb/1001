package content.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflect {
	private String name; 
	public String words; 
	protected int age; 
	
	
	
	public  void mainR() throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
		
		//1. 获取 Class 类型
		//(1) 类名.class
		Class<Reflect> c = Reflect.class;
		//(2). 对象.getClass()
		Reflect re = new Reflect();
		Class<? extends Reflect> c1 = re.getClass();
		
		//(3). 根据路径 找 Class
		Class<?> c2 = null;
		try {
			 c2 = Class.forName("content.reflect.Reflect");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("c1:"+c1);
		System.out.println("c2:"+c2);
		
		Reflect  resss = new Reflect();
		resss.setName("反射...");
		
		//【2】 获取       属性     方法        构造方法       类   注解
		  // 属性 ：  私有  protected public
		Field res = c2.getField("words");
		String result =  (String)res.get(resss);
		
		System.out.println("属性的值是:"+result);
		
		//【3】获取   方法   
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
		System.out.println("私有的方法");
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
