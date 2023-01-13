package edu.guanabara.aula07_relacionamento_entre_classes;

public class UltraEmojiCombat {
	public static void main(String[] args) {
		Fighter fighter[] = new Fighter[6];

		fighter[0] = new Fighter("Pretty Boy", "France", 31, 1.75f, 68.9f, 11, 2, 1);

		fighter[1] = new Fighter("Putscript", "Brazil", 29, 1.68f, 57.8f, 14, 2, 3);

		fighter[2] = new Fighter("Sanpshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);

		fighter[3] = new Fighter("Dead Code", "Canada", 28, 1.93f, 81.9f, 13, 0, 2);

		fighter[4] = new Fighter("UFOCobol", "Ireland", 37, 1.70f, 119.3f, 5, 4, 3);

		fighter[5] = new Fighter("Nerdaart", "Portugal", 30, 1.81f, 105.7f, 12, 2, 4);

		fighter[3].present();
		fighter[4].status();

		Fight UEC01 = new Fight();
		UEC01.schaduleFight(fighter[0], fighter[1]); //Marcando a luta
		UEC01.fight();
	}
}
