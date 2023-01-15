package edu.guanabara.aula12_polimorfismo;

public abstract class Animal {
	protected float weight;
	protected int age;
	protected int member;


	public abstract void movement();
	public abstract void aliment();
	public abstract void sound();

	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public int getMember() {
		return member;
	}
	public void setMember(int member) {
		this.member = member;
	}
}
