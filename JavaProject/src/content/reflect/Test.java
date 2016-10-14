package content.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args)
			throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, InstantiationException, NoSuchFieldException {
		Reflect ref = new Reflect();

		Class<?> c1 = Class.forName("content.reflect.Reflect");
		Class<? extends Reflect> c2 = ref.getClass();
		Class<Reflect> c3 = Reflect.class;

		Reflect r = (Reflect) c2.newInstance();

		Method mth = c1.getMethod("speak", String.class);
//		Method mth4 = c1.getMethod("run");
		Method mth2 = c2.getMethod("speak");
		Method mth3 = c3.getMethod("speak", String.class, int.class);

		Field fld = c2.getField("words");

		r.speak();
		mth.invoke(ref, "Lucy");
		mth2.invoke(ref);
		mth3.invoke(ref, "Tom", 20);
//		mth4.invoke(ref);
	}

}
