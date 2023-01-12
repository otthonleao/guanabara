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
	//Nome
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//Nacionalidade
	public String getNationality() {
		return this.nationality;
	}
	public void setNationatily(String nationality) {
		this.nationality = nationality;
	}
	//Idade
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//Altura
	public float getHeight() {
		return this.height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	//Peso
	public float getWeight() {
		return this.weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
		setCategory();
	}
	//Categoria
	public String getCategory() {
		return this.category;
	}
	private void setCategory() {
		if (this.getWeight() < 52.2) {
			this.category = "Invalid";
		} else if (this.getWeight() <= 70.3) {
			this.category = "Light"; //Leve
		} else if (this.getWeight() <= 83.9) {
			this.category = "Medium";
		} else if (this.getWeight() <= 120.2) {
			this.category = "Heavy";
		} else {
			this.category = "Invalid";
		}	
	}
	//Vitórias
	public int getWins() {
		return this.wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	//Derrotas
	public int getLosses() {
		return this.losses;
	}
	public void getLosses(int losses) {
		this.losses = losses;
	}
	//Empates
	public int getDrawns() {
		return this.drawns;
	}
	public void setDrawns(int drawns) {
		this.drawns = drawns;
	}
}
