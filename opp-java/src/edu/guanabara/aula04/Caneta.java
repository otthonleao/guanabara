package edu.guanabara.aula04;

public class Caneta {
	private String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;

	//Método Construtor
	public Caneta(String m, String c, float p) {
		this.modelo = m;
		this.cor = c;
		this.setPonta(p);
		this.tampar();
	}

	//Método GET: é a autorização para dar acesso ao atributo dentro do objeto que foi declarado como 'private'. Assim, podemos obter o valor da variável que estamos querendo. Note que o retorno tem que ser do mesmo tipo da variável
	public String getModelo() {
		return this.modelo;
	}

	//Método SET: é a forma autorizada para modificar as variáveis de objetos que foram declarados como 'private'. O SET sempre será um método(), logo o argumento é necessário passar pelo parâmetro para poder ser modificado.
	public void setModelo(String m) {
		this.modelo = m;
	}

	//GET e SET para Cor
	public String getCor() {
		return this.cor;
	}
	public void setCor(String c) {
		this.cor = c;
	}

	//GET e SET para Ponta
	public float getPonta() {
		return this.ponta;
	}
	public void setPonta(float p) {
		this.ponta = p;
	}

	public void tampar() {
		this.tampada = true;
	}
	public void destampar() {
		this.tampada = false;
	}

	public void status() {
		System.out.println("SOBRE A CANETA");
		System.out.println("MODELO: " + getModelo());
		System.out.println("COR: " + getCor());
		System.out.println("PONTA: " + getPonta());
		System.out.println("TAMPADA: " + tampada);
	}
}
