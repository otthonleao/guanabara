package edu.guanabara.aula06_encapsulamento;

public class RemoteControllerMain {
	public static void main(String[] args) {
		RemoteControl c = new RemoteControl();
		c.turnOn(); //Ligar
		c.openMenu(); //abrir o menu
		c.volumeTurnUp();
		c.volumeTurnUp();
		c.volumeTurnUp();
		c.play();

		System.out.println("\ninicio teste do que nao deve ser feito quando estiver desligado");
		c.turnOff();
		c.muteOff();
		c.muteOn();
		c.volumeTurnDown();
		c.volumeTurnUp();
		c.openMenu();
		c.closeMenu();
		c.play();
		c.pause();
		System.out.println("FIM DE TESTE");

		c.turnOn();
		c.openMenu();
		c.play();
		c.pause();
		c.volumeTurnDown();
		c.volumeTurnDown();
		c.getVolume();
		c.volumeTurnDown();
		c.volumeTurnDown();
		c.volumeTurnDown();
		c.volumeTurnDown();
		c.volumeTurnDown();
		c.volumeTurnDown();
		c.muteOn();
		c.volumeTurnDown();
		

	}
}
