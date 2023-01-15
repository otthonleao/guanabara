package edu.guanabara.aula12_polimorfismo;

public class Bird extends Animal {
	private String featherColor; //pena

	public String getFeatherColor() {
		return featherColor;
	}
	public void setFeatherColor(String featherColor) {
		this.featherColor = featherColor;
	}

	@Override
	public void aliment() {
		System.out.println("Flying");
	}
	@Override
	public void movement() {
		System.out.println("Eating Fruit");
	}
	@Override
	public void sound() {
		System.out.println("Bird Sound");
	}

	public void nidify() { //fazer ninho
		System.out.println("Building Nest");
	}
}
