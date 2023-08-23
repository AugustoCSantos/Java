package prova1;

import java.util.ArrayList;

public class Jogo {
	private final String nome;
	private ArrayList<Fase> fase;
	private ArrayList<Personagem> personagens;
	
	public Jogo(String nome) {
		this.nome = nome;
		this.fase = new ArrayList<Fase>();
		this.personagens = new ArrayList<Personagem>();
	} //construtor jogo

	public ArrayList<Fase> getFase() {
		return fase;
	}
	public void setFase(ArrayList<Fase> fase) {
		this.fase = fase;
	}

	public ArrayList<Personagem> getPersonagens() {
		return personagens;
	}
	public void setPersonagens(ArrayList<Personagem> personagens) {
		this.personagens = personagens;
	}

	public String getNome() {
		return nome;
	}
	
}
