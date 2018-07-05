package test;

public class User {
	private String name;

	private int age;

	public User() {
		System.out.println("--------User()------------");

	}

	public User(String name) {
		System.out.println("-------- User(String name)------------" + name);
	}

	private User(String name, int age) {
		System.out.println("-------- User(String name, int age)------------" + name + "," + age);
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

}
