package edu.guanabara.aula11_heranca2;

public class Bolsista extends Student {
	private float bolsa;

	public void renewBolsa() {
		System.out.println("\nRenovando Bolsa de " + this.getName());
	}

	public float getBolsa() {
		return bolsa;
	}
	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}

	//Sobreposição do método 'payTuition()' que tem na classe 'Student', mas aqui na classe 'Bolsista' vai sobrepor para esse código. Só é possível pq o método em 'Student' (que está como mãe de 'Bolsista') não está como método final dessa forma "public final void payTuition() {}"
	@Override
	public void payTuition() {
		System.out.println(this.getName() + " has discount of " + bolsa + "%");
	}

	@Override
	public String toString() {
		return "Bolsista [name = " + this.getName() + ", age = " + this.getAge() + ", sex = " + this.getSex() + ", registration = " + this.getRegistration() + ", course = " + this.getCourse() + ", bolsa = " + bolsa + "%]";
	}

	
}
