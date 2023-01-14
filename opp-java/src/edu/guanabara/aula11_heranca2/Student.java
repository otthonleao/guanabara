package edu.guanabara.aula11_heranca2;

public class Student extends Person {
	private int registration;
	private String course;

	public void payTuition() {
		System.out.println("Paying " + this.getName() + "'s tuition...");
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

	@Override
	public String toString() {
		return "Student [name = " + this.getName() + ", age = " + this.getAge() + ", sex = " + this.getSex() + ", registration = " + registration + ", course = " + course + "]";
	}

	
}
