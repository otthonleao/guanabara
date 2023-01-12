package edu.guanabara.aula07_relacionamento_entre_classes;

public class UltraEmojiCombat {
	public static void main(String[] args) {
		Fighter fighter1 = new Fighter("Pretty Boy", "France", 31, 1.75f, 68.9f, 11, 2, 1);
		fighter1.present();
		fighter1.status();
	}
}
