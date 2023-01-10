package edu.guanabara.aula06_encapsulamento;

public class RemoteControl {
	//Attributes
	private int volume;
	private boolean turnedOn;
	private boolean playing;

	//Constructor
	public RemoteControl() {
		this.volume = 20;
		this.turnedOn = false;
		this.playing = false;
	}

	//GETTER e SETTERS
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
}
