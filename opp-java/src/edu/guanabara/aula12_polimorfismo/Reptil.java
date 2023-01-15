package edu.guanabara.aula12_polimorfismo;

public class Reptil extends Animal {
	private String squama;

	public String getSquama() {
		return squama;
	}
	public void setSquama(String squama) {
		this.squama = squama;
	}

	@Override
	public void aliment() {
		System.out.println("Eating Vegetable");
	}

	@Override
	public void movement() {
		System.out.println("Crawling"); //Rastejando
	}

	@Override
	public void sound() {
		System.out.println("Reptil Sound");
	}


}
