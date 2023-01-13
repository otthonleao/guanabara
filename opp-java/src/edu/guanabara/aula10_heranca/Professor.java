package edu.guanabara.aula10_heranca;

public class Professor extends Person {
	private String specialty;
	private float wage;
	
	public void increaseWage(float increase) {
		this.wage += increase;
	}

	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public float getWage() {
		return wage;
	}
	public void setWage(float wage) {
		this.wage = wage;
	}
}
