package edu.guanabara.aula07_relacionamento_entre_classes;

import java.util.Random;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Fight {
	private Fighter challenged; //desafiado
	private Fighter challenging; //desafiante
	private int rounds;
	private boolean approved;

	//Public Methods
	public void schaduleFight(Fighter play1, Fighter play2) {
		if ((play1.getCategory().equals(play2.getCategory())) && (play1 != play2)){ //Nesse caso temos que usar o '.equals' para comparação ao invés de '==' pq estamos comparando duas strings
			this.approved = true;
			this.challenged = play1;
			this.challenging = play2;
		} else {
			this.approved = false;
			this.challenged = null;
			this.challenging = null;
		}
	}
	public void fight() {
		if(this.approved == true) {
			System.out.println("\n##############        ULTRA EMOJI COMBAT        ##############");
			System.out.println("##############              APROVED             ##############");

			String play1 = this.challenged.getName();
			System.out.println("\nWith yooouuuu... the Challenged is: " + play1);
			this.challenged.present();

			String play2 = this.challenging.getName();
			System.out.println("\nAnd the Challenging is: " + play2);
			this.challenging.present();

			//Sortear o resultado da luta
			Random aleatory = new Random();
			int winner = aleatory.nextInt(3); //Sortear 3 números: 0, 1, 2.
			switch(winner) {
				case 0: //Empate caso o sorteio for 0;
					System.out.println("\nIT'S TIE");
					this.challenged.drawnFight();
					this.challenging.drawnFight();
					break;
				case 1: //Desafiado vence
					System.out.println("\nVICTORY OF " + this.challenged.getName());
					this.challenged.winFight();
					this.challenging.lossFight();
					break;
				case 2: //Desafiante vence
					System.out.println("\nVICTORY OF " + this.challenging.getName());
					this.challenged.lossFight();
					this.challenging.winFight();
					break;
			}
			System.out.println("\nAfter this big fight:");
			System.out.println(play1 + " status now is: ");
			System.out.println("Wins: " + this.challenged.getWins());
			System.out.println("Losses: " + this.challenged.getLosses());
			System.out.println("Drawns: " + this.challenged.getDrawns());
			System.out.println("\n" + play2 + " status now is: ");
			System.out.println("Wins: " + this.challenging.getWins());
			System.out.println("Losses: " + this.challenging.getLosses());
			System.out.println("Drawns: " + this.challenging.getDrawns());
		}
	}

	//Special Methods
	public Fighter getChallenged() {
		return challenged;
	}
	public void setChallenged(Fighter challenged) {
		this.challenged = challenged;
	}

	public Fighter getChallenging() {
		return challenging;
	}
	public void setChallenging(Fighter challenging) {
		this.challenging = challenging;
	}

	public int getRounds() {
		return this.rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean approved() {
		return this.approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
}
