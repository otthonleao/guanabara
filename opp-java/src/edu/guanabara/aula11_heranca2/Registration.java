package edu.guanabara.aula11_heranca2;

public class Registration {
	public static void main(String[] args) {
		
		//Instanciando um tipo de herança de implementação/pobre. Note que a classe 'Visitor', não tem nenhum método ou atributo, está tudo sendo herdado da superclasse 'Person'
		Visitor v1 = new Visitor();
		v1.setName("Otthon");
		v1.setAge(34);
		v1.setSex('M');
		System.out.println("\n" + v1.toString() + "\n");

		//Student é filha de Person
		Student s1 = new Student();
		s1.setName("Roany");
		s1.setAge(25);
		s1.setSex('W');
		s1.setRegistration(12345);
		s1.setCourse("Accounting");
		s1.payTuition();
		System.out.println(s1.toString());

		//Bolsista é filha de Student e descendente de Person, então herda tudo da classe raiz Person.
		Bolsista b1 = new Bolsista();
		b1.setName("Ronie");
		b1.setAge(5);
		b1.setSex('M');
		b1.setRegistration(54321);
		b1.setCourse("Information of Technogoly");
		b1.setBolsa(75.18f);
		b1.payTuition(); //Método sobreposto ao 'payTuition()' de 'Student'. Isso só é possível porque na classe 'Student' o método não está definido com 'final'
		b1.renewBolsa();
		System.out.println(b1.toString());


	}
}
