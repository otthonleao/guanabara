package edu.guanabara.aula12_polimorfismo;

public class Fish extends Animal{
	private String SchemaColor;

	public String getSchemaColor() {
		return SchemaColor;
	}
	public void setSchemaColor(String schemaColor) {
		SchemaColor = schemaColor;
	}

	public void emitSound() {
		System.out.println("Fish don't emit sound");
	}
	public void dropBubble() {
		System.out.println("Dropped a bubble");
	}

	@Override
	public void aliment() {
		System.out.println("Eating Substance");
	}

	@Override
	public void movement() {
		System.out.println("Swimming");
	}

	@Override
	public void sound() {
		System.out.println("Don't emit sound");
	}
	
}
