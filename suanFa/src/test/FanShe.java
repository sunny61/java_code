package test;

import java.lang.reflect.Constructor;

public class FanShe {

	public static void main(String[] args) throws Exception {
		Class<User> clz = User.class;
		/**
		 * �޲ι���
		 */
		Constructor<User> constructor = clz.getConstructor();
		User u = constructor.newInstance();
		System.out.println(u);
		System.out.println("--------------------");
		/**
		 * �вι���
		 */
		Constructor<User> c2 = clz.getConstructor(String.class);
		User u2 = c2.newInstance("С��");
		System.out.println(u2);
		System.out.println("--------------------");
		/**
		 * ����˽�й�����
		 */
		Constructor<User> c3 = clz.getDeclaredConstructor(String.class, int.class);
		// ���ÿɷ���
		c3.setAccessible(true);
		User u3 = c3.newInstance("С��", 1);
		System.out.println(u3);
		System.out.println("--------------------");

	}

}
