package task.E20160803.task.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException {
		// ��ȡclass���͵����ַ���
		// 1������.class
		Class<Reflect> c1 = Reflect.class;
		System.out.println(c1);
		// 2������.getClass()
		Reflect rf = new Reflect();
		System.out.println(rf.getClass());
		// 3) ����·����class
		Class<?> c2 = Class.forName("task.E20160803.task.reflect.Reflect");
		System.out.println(c2);

		try {
			// ��ȡ��������
			c1.getField("name");
			// ��ȡ˽������
			// c1.getField("sex"); // ����
			// ��ȡ�ܱ�������
			// c1.getField("age"); // ����

			// ��ȡ˽�й��췽��
			// c1.getConstructor(String.class); // ����
			// ��ȡ�������췽��
			c1.getConstructor();
			// ��ȡ�ܱ������췽��
			// c1.getConstructor(Integer.class); // ����

			// ��ȡ˽�з���
			// c1.getMethod("fun1"); //����
			// ��ȡ��������
			c1.getMethod("fun2");
			// ��ȡ�ܱ�������
			// c1.getMethod("fun3"); // ����

			// �½�Reflect����
			Reflect rf1 = c1.newInstance();

			Method mth = c1.getMethod("fun2"); // ˽�к��ܱ����ķ�������
			// ����������
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
