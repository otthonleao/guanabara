package edu.guanabara.aula07_relacionamento_entre_classes;

public class Fighter {
	//Atributos
	private String name;
	private String nationality;
	private int age;
	private float height, weight;
	private String category;
	private int wins, losses, drawns; //vitórias, derrotas, empates

	//Métodos Públicos
	public void present() {

	}

	public void status() {

	}

	public void winFight() {

	}

	public void lossFight() {

	}

	public void drawnFight() {

	}

	//Construtor - Métodos Especiais
	public Fighter(String name, String nationality, int age, float height, float weight, int wins, int losses, int drawns) {
		this.name = name;
		this.nationality = nationality;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.wins = wins;
		this.losses = losses;
		this.drawns = drawns;
	}
}
