package task.E20160803.task.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException {
		// 获取class类型的三种方法
		// 1）类名.class
		Class<Reflect> c1 = Reflect.class;
		System.out.println(c1);
		// 2）对象.getClass()
		Reflect rf = new Reflect();
		System.out.println(rf.getClass());
		// 3) 根据路径找class
		Class<?> c2 = Class.forName("task.E20160803.task.reflect.Reflect");
		System.out.println(c2);

		try {
			// 获取公有属性
			c1.getField("name");
			// 获取私有属性
			// c1.getField("sex"); // 不可
			// 获取受保护属性
			// c1.getField("age"); // 不可

			// 获取私有构造方法
			// c1.getConstructor(String.class); // 不可
			// 获取公开构造方法
			c1.getConstructor();
			// 获取受保护构造方法
			// c1.getConstructor(Integer.class); // 不可

			// 获取私有方法
			// c1.getMethod("fun1"); //不可
			// 获取公开方法
			c1.getMethod("fun2");
			// 获取受保护方法
			// c1.getMethod("fun3"); // 不可

			// 新建Reflect对象
			Reflect rf1 = c1.newInstance();

			Method mth = c1.getMethod("fun2"); // 私有和受保护的方法不可
			// 方法反调用
			mth.invoke(rf1);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
