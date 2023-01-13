package edu.guanabara.aula10_heranca;

public class Person {
	private String name;
	private int age;
	private char sex;

	public void bitrhday () {
		this.setAge(age++);
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return this.sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
}
