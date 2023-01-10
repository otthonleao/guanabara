package edu.guanabara.aula06_encapsulamento;

public class RemoteControl implements Controller {
	//Attributes
	private int volume;
	private boolean turnedOn;
	private boolean playing;

	private void volume() {
		System.out.print("Volume: " + this.getVolume() + " ");
		for (int i = 0; i <= this.getVolume(); i += 1) {
			System.out.print(" o");
		}
		System.out.println();
	}

	//Constructor
	public RemoteControl() {
		this.volume = 10;
		this.turnedOn = false;
		this.playing = false;
	}

	//GETTER e SETTERS dos atributos
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean getTurnedOn() {
		return turnedOn;
	}
	public void setTurnedOn(boolean turnedOn) {
		this.turnedOn = turnedOn;
	}
	
	public boolean getPlaying() {
		return playing;
	}
	public void setPlaying(boolean playing) {
		this.playing = playing;
	}

	// Métodos Abstratos
	// Aqui que a classe RemoteControl vai utilizar a interface da classe Controller
	//Override significa sobrescrever, ou seja, eu já tinha um método definido como abstrato e agora estou sobrescrevendo, isto é, estou desconsiderando aquela programação que não tinha sido feita e agora vou programar cada um deles.
	@Override
	public void turnOn() {
		this.setTurnedOn(true);
		System.out.println("\nOLÁ, VOCÊ LIGOU...");
	}

	@Override
	public void turnOff() {
		this.setTurnedOn(false);
		System.out.println("DESLIGANDO...");
		this.setVolume(10);
		this.setPlaying(false);
	}

	@Override
	public void openMenu() {
		if (this.getTurnedOn() == true) {
			System.out.println("=================================");
			System.out.println("====            MENU         ====");
			System.out.println("=================================");
			System.out.println("Is it turned on? " + this.getTurnedOn());
			System.out.println("Is it playing? " + this.getPlaying());
		volume();
		}
	}

	@Override
	public void closeMenu() {
		if (this.getTurnedOn())
			System.out.println("\nFECHANDO MENU.....");
	}

	@Override
	public void volumeTurnUp() {
		if (this.getTurnedOn() == true) {
			this.setVolume(this.getVolume() + 1);
			volume();
		}
	}

	@Override
	public void volumeTurnDown() {
		if (this.getTurnedOn() == true) {
			this.setVolume(this.getVolume() - 1);
			volume();
		}
	}

	@Override
	public void muteOn() {
		if (this.getTurnedOn()  && this.getVolume() > 0) {
			this.setVolume(0);
			System.out.println("MUDO ATIVADO");
		}
	}

	@Override
	public void muteOff() {
		if (this.getTurnedOn() && this.getVolume() == 0) {
			this.setVolume(20);
			System.out.println("MUDO DESATIVADO");

		}
	}

	@Override
	public void play() {
		if (this.getTurnedOn() && !(this.getPlaying())) {
			this.setPlaying(true);
			System.out.println("PLAY ATIVADO");
		}
	}

	@Override
	public void pause() {
		if (this.getTurnedOn() && this.getPlaying()) {
			this.setPlaying(false);
			System.out.println("PAUSADO");
		}
	}

}
