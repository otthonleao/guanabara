package edu.guanabara.aula10_heranca;

public class PeopleProject {
	public static void main(String[] args) {
		Person person = new Person();
		Student personStudent = new Student();
		Professor personProfessor = new Professor();
		Employee personEmployee = new Employee();

		person.setName("Otthon");
		personStudent.setName("Roany");
		personProfessor.setName("Guanabara");
		personEmployee.setName("Ronie");

		System.out.println(person.toString());
		System.out.println(personStudent.toString());
		System.out.println(personProfessor.toString());
		System.out.println(personEmployee.toString());

		person.setSex('M');
		personStudent.setSex('W');
		personProfessor.setSex('M');
		personEmployee.setSex('M');

		System.out.println("\n" + person.toString());
		System.out.println(personStudent.toString());
		System.out.println(personProfessor.toString());
		System.out.println(personEmployee.toString());
	}
}
