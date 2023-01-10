package edu.guanabara.aula04;
public class MetodosEspeciais {
    public static void main(String[] args) throws Exception {

		Caneta c1 = new Caneta("BIC", "Azul", 0.5f);
		c1.status();
		System.out.println("\n");

		//Agora vamos destampar e alterar a cor que é private
		c1.setCor("Preta");
		c1.destampar();
		c1.status();
    }
}
