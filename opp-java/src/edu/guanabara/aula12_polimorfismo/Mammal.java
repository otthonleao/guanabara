package edu.guanabara.aula12_polimorfismo;

public class Mammal extends Animal {
	private String pelageColor;

	public String getPelageColor() {
		return pelageColor;
	}
	public void setPelageColor(String pelageColor) {
		this.pelageColor = pelageColor;
	}

	@Override
	public void aliment() {
		System.out.println("Suckling"); //Mamando
	}

	@Override
	public void movement() {
		System.out.println("Running");
	}

	@Override
	public void sound() {
		System.out.println("Mammal Sound");
	}
	
}
