package edu.guanabara.aula10_heranca;

public class Student extends Person {
	private int registration;
	private String course;

	public void cancelRegistation() {
		System.out.println("\n!!!     REGISTRATION CANCELLED     !!!\n");
	}

	public int getRegistration() {
		return registration;
	}
	public void setRegistration(int registration) {
		this.registration = registration;
	}

	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}


}
