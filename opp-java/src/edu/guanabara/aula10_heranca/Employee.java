package edu.guanabara.aula10_heranca;

public class Employee extends Person { //Funcionário
	private String department;
	private boolean working;

	public void changeWork() {
		this.working = !this.working;
	}

	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public boolean getWorking() {
		return working;
	}
	public void setWorking(boolean working) {
		this.working = working;
	}
}
