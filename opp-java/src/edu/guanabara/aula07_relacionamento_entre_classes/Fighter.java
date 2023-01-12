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
		System.out.println("---------------------------------");
		System.out.println("It's time!!! With you the figther " + this.getName() + ", with " + this.getAge() + " years old, from " + this.getNationality() + ". Weighing " + this.getWeight() + "kg and height " + this.getHeight() + "meters.");
		System.out.println("- " + this.getWins() + " wins");
		System.out.println("- " + this.getLosses() + " losses");
		System.out.println("- " + this.getDrawns() + " drawns");
	}

	public void status() {
		System.out.println(this.getName() + " is on category " + this.getCategory());
		System.out.println("Won" + this.getWins() + " times");
		System.out.println("Lost" + this.getLosses() + " times");
		System.out.println("Tied" + this.getDrawns() + " times");
	}

	public void winFight() {
		this.setWins(this.getWins() + 1);
	}

	public void lossFight() {
		this.setLosses(this.getLosses() + 1);
	}

	public void drawnFight() {
		this.setDrawns(this.getDrawns() + 1);
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
	public void setLosses(int losses) {
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
