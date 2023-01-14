package edu.guanabara.aula11_heranca2;

public abstract class Person {
	private String name;
	private int age;
	private char sex;

	public final void toDoBirthday() {
		this.setAge(this.getAge() + 1);
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

	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Person [name = " + name + ", age = " + age + ", sex = " + sex + "]";
	}
}
