package test;

import java.lang.reflect.Constructor;

public class FanShe {

	public static void main(String[] args) throws Exception {
		Class<User> clz = User.class;
		/**
		 * 无参构造
		 */
		Constructor<User> constructor = clz.getConstructor();
		User u = constructor.newInstance();
		System.out.println(u);
		System.out.println("--------------------");
		/**
		 * 有参构造
		 */
		Constructor<User> c2 = clz.getConstructor(String.class);
		User u2 = c2.newInstance("小明");
		System.out.println(u2);
		System.out.println("--------------------");
		/**
		 * 调用私有构造器
		 */
		Constructor<User> c3 = clz.getDeclaredConstructor(String.class, int.class);
		// 设置可访问
		c3.setAccessible(true);
		User u3 = c3.newInstance("小明", 1);
		System.out.println(u3);
		System.out.println("--------------------");

	}

}
